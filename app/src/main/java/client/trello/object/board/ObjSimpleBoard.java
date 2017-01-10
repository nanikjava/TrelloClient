package client.trello.object.board;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import client.trello.object.ObjTrello;
import client.trello.object.lists.ObjList;

/**
 * Created by nanik on 10/01/17.
 */

public class ObjSimpleBoard  extends ObjTrello{
    //    {"id":"587440db5252a52376d0f258","name":"Melbourne Board","desc":"","lists":[{"id":"587440e6206d107632ca536a",
// "name":"First Melbourne List"},{"id":"58744cb2093bfc69d866c01e","name":"Another Melbourne List"}]}
    @SerializedName("id")
    String id;
    @SerializedName("name")
    String name;
    @SerializedName("desc")
    String desc;
    @SerializedName("lists")
    ArrayList<ObjList> lists;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<ObjList> getLists() {
        return lists;
    }

    public void setLists(ArrayList<ObjList> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "ObjSimpleBoard{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", lists=" + lists +
                '}';
    }
}
