package client.trello.object.board;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import client.trello.object.ObjTrello;

/**
 * Created by nanik on 10/01/17.
 */

public class ObjBoards extends ObjTrello {
    //    [
//    {
//        "closed": false,
//            "dateLastActivity": "2017-01-09T21:41:18.910Z",
//            "dateLastView": "2017-01-09T22:28:09.180Z",
//            "desc": "",
//            "descData": null,
//            "id": "5874037e419e3091f628523c",
//            "idOrganization": null,
//            "idTags": [],
//        "invitations": null,
//            "invited": false,
//            "labelNames": {
//        "black": "",
//                "blue": "",
//                "green": "This is a green label",
//                "lime": "",
//                "orange": "",
//                "pink": "",
//                "purple": "",
//                "red": "",
//                "sky": "",
//                "yellow": ""
//    },
//        "memberships": [
//        {
//            "deactivated": false,
//                "id": "5874037e419e3091f628523f",
//                "idMember": "50095233f62adbe04d935195",
//                "memberType": "normal",
//                "unconfirmed": false
//        },
//        {
//            "deactivated": false,
//                "id": "5874037e419e3091f6285240",
//                "idMember": "5874037e419e3091f6285239",
//                "memberType": "admin",
//                "unconfirmed": false
//        }
//        ],
//        "name": "*Tutorial Board (Start Here!)",
//            "pinned": null,
//            "powerUps": [],
//        "prefs": {
//        "background": "sky",
//                "backgroundBrightness": "dark",
//                "backgroundColor": "#00AECC",
//                "backgroundImage": null,
//                "backgroundImageScaled": null,
//                "backgroundTile": false,
//                "calendarFeedEnabled": false,
//                "canBeOrg": true,
//                "canBePrivate": true,
//                "canBePublic": true,
//                "canInvite": true,
//                "cardCovers": true,
//                "comments": "members",
//                "invitations": "members",
//                "permissionLevel": "private",
//                "selfJoin": true,
//                "voting": "disabled"
//    },
//        "shortLink": "QLMUmKB8",
//            "shortUrl": "https://trello.com/b/QLMUmKB8",
//            "starred": false,
//            "subscribed": false,
//            "url": "https://trello.com/b/QLMUmKB8/tutorial-board-start-here"
//    }
//    ]

    @SerializedName("closed")
    boolean closed;

    @SerializedName("dateLastActivity")
    String dateLastActivity;

    @SerializedName("dateLastView")
    String dateLastView;

    @SerializedName("desc")
    String desc;

    @SerializedName("descData")
    String descData;


    @SerializedName("id")
    String id;

    @SerializedName("idOrganization")
    int idOrganization;

    @SerializedName("idTags")
    String[] idTags;

    @SerializedName("invitations")
    String invitations;

    @SerializedName("invited")
    boolean invited;

    @SerializedName("labelNames")
    HashMap<String, String> labelNames;

    @SerializedName("memberships")
    ArrayList<ObjMembership> memberships;

    @SerializedName("name")
    String name;

    @SerializedName("pinned")
    String pinned;

    @SerializedName("powerUps")
    String[] powerUps;

    @SerializedName("prefs")
    ObjPrefs prefs;

    @SerializedName("shortLink")
    String shortLink;

    @SerializedName("starred")
    boolean  starred;

    @SerializedName("subscribed")
    boolean subscribed;

    @SerializedName("url")
    String url;

    public ObjBoards() {
        baseURI = new String("/boards/");
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public String getDateLastActivity() {
        return dateLastActivity;
    }

    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    public String getDateLastView() {
        return dateLastView;
    }

    public void setDateLastView(String dateLastView) {
        this.dateLastView = dateLastView;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescData() {
        return descData;
    }

    public void setDescData(String descData) {
        this.descData = descData;
    }

    public int getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(int idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String[] getIdTags() {
        return idTags;
    }

    public void setIdTags(String[] idTags) {
        this.idTags = idTags;
    }

    public String getInvitations() {
        return invitations;
    }

    public void setInvitations(String invitations) {
        this.invitations = invitations;
    }

    public HashMap<String, String> getLabelNames() {
        return labelNames;
    }

    public void setLabelNames(HashMap<String, String> labelNames) {
        this.labelNames = labelNames;
    }

    public ArrayList<ObjMembership> getMemberships() {
        return memberships;
    }

    public void setMemberships(ArrayList<ObjMembership> memberships) {
        this.memberships = memberships;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinned() {
        return pinned;
    }

    public void setPinned(String pinned) {
        this.pinned = pinned;
    }

    public String[] getPowerUps() {
        return powerUps;
    }

    public void setPowerUps(String[] powerUps) {
        this.powerUps = powerUps;
    }

    public ObjPrefs getPrefs() {
        return prefs;
    }

    public void setPrefs(ObjPrefs prefs) {
        this.prefs = prefs;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ObjBoard{" +
                "closed=" + closed +
                ", dateLastActivity='" + dateLastActivity + '\'' +
                ", dateLastView='" + dateLastView + '\'' +
                ", desc='" + desc + '\'' +
                ", descData='" + descData + '\'' +
                ", idOrganization=" + idOrganization +
                ", idTags=" + Arrays.toString(idTags) +
                ", invitations='" + invitations + '\'' +
                ", labelNames=" + labelNames +
                ", memberships=" + memberships +
                ", name='" + name + '\'' +
                ", pinned='" + pinned + '\'' +
                ", powerUps=" + Arrays.toString(powerUps) +
                ", prefs=" + prefs +
                ", shortLink='" + shortLink + '\'' +
                ", starred=" + starred +
                ", subscribed=" + subscribed +
                ", url='" + url + '\'' +
                '}';
    }
}
