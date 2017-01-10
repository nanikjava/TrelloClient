package client.trello;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import client.trello.object.board.ObjSimpleBoard;
import client.trello.object.lists.ObjList;
import client.trello.object.user.ObjUser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "trello";
    final String TRELLO_API = "https://api.trello.com/1/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PostFetcher fetcher = new PostFetcher();
        fetcher.execute();
    }

    private class PostFetcher extends AsyncTask<Void, Void, String> {
        String token="";
        String key="";
        String SERVER_URL =TRELLO_API + "/members/me?" + getKeyAndToken();

        @Override
        protected String doInBackground(Void... params) {
            try {
                String json = getJson(SERVER_URL);
                ObjUser user = parseUserObject(json);
                ArrayList boards = new ArrayList();
                HashMap boardMap = user.getBoards();

                //loop through the boards
                ArrayList boardStringIdList = user.getIdBoards();

                for (int  i=0;i<boardStringIdList.size();i++) {
                    String boardid = (String)boardStringIdList.get(i);
                    SERVER_URL = TRELLO_API + "boards/" + boardid + "?lists=open&list_fields=name&fields=name,desc" + getKeyAndToken();
                    ObjSimpleBoard objBoard = parseUserBoards(getJson(SERVER_URL));
                    boardMap.put(objBoard.getId(),objBoard);
                }

                // now loop through the list to get more info about
                // the list is inside ObjSimpleBoard so need to loop twice
                // once for looping through the board and the other one
                // to loop through the list inside the board
                Iterator it  = boardMap.keySet().iterator();

                while (it.hasNext()) {
                    String key = (String) it.next();
                    ObjSimpleBoard board = (ObjSimpleBoard)boardMap.get(key);
                    ArrayList listArrayList = board.getLists();
                    if (listArrayList!=null) {
                        for (int listCtr=0;listCtr<listArrayList.size();listCtr++) {
                            ObjList list = (ObjList)listArrayList.get(listCtr);
                            Log.i(TAG,"" + list);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        private String getKeyAndToken(){
            return "&token="+ token + "&key=" + key;
        }

        private String getJson(String url) {
            String responseString=null;

            OkHttpClient client = new OkHttpClient
                    .Builder()
                    .readTimeout(50, TimeUnit.SECONDS)
                    .writeTimeout(50,TimeUnit.SECONDS)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .build();
            Request request = new Request.Builder().url(url).build();
            try {
                Response response = client.newCall(request).execute();
                responseString =  response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                return responseString;
            }
        }

        /**
         * parse list data of a board
         * @param json
         * @return
         * @throws JSONException
         */
        private ObjList parseList(String json) throws JSONException {
            Gson gson = new GsonBuilder().create();
            ObjList object = gson.fromJson(json, ObjList.class);
            Log.i(TAG, "parseList = " + object.toString());
            return object;
        }

        /**
         * parse boards data
         * @param json
         * @return
         * @throws JSONException
         */
        private ObjSimpleBoard parseUserBoards(String json) throws JSONException {
            Gson gson = new GsonBuilder().create();
            ObjSimpleBoard board = gson.fromJson(json, ObjSimpleBoard.class);
            Log.i(TAG, "parseUserBoards = " + board.toString());
            return board;
        }

        /**
         * parse user object
         * @param json
         * @return
         * @throws JSONException
         */
        private ObjUser parseUserObject(String json) throws JSONException {
            Gson gson = new GsonBuilder().create();
            ObjUser board = gson.fromJson(json, ObjUser.class);
            Log.i(TAG, "parseUserObject = " + board.toString());
            return board;
        }
    }
}
