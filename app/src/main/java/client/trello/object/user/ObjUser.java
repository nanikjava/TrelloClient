package client.trello.object.user;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import client.trello.object.ObjTrello;
import client.trello.object.board.ObjSimpleBoard;

/**
 * Created by nanik on 10/01/17.
 */

public class ObjUser  extends ObjTrello{
//    {
//        "avatarHash": null,
//            "avatarSource": "none",
//            "bio": "",
//            "bioData": null,
//            "confirmed": true,
//            "email": null,
//            "fullName": "Nanik",
//            "gravatarHash": "4b5c382915ab16f474d84fbbd8787903",
//            "id": "5874037e419e3091f6285239",
//            "idBoards": [
//        "5874037e419e3091f628523c",
//                "58743f453f1cc0eb4bd6f26b",
//                "587440db5252a52376d0f258"
//        ],
//        "idBoardsPinned": null,
//            "idEnterprise": null,
//            "idEnterprisesAdmin": [],
//        "idOrganizations": [
//        "5874038e2832f44b4a04d7a2"
//        ],
//        "idPremOrgsAdmin": [],
//        "initials": "N",
//            "loginTypes": null,
//            "memberType": "normal",
//            "oneTimeMessagesDismissed": [
//        "quick-team-create"
//        ],
//        "prefs": {
//        "colorBlind": false,
//                "locale": "en-US",
//                "minutesBeforeDeadlineToNotify": 1440,
//                "minutesBetweenSummaries": 1,
//                "sendSummaries": true
//    },
//        "premiumFeatures": [],
//        "products": [],
//        "status": "disconnected",
//            "trophies": [],
//        "uploadedAvatarHash": null,
//            "url": "https://trello.com/nanik2",
//            "username": "nanik2"
//    }

    @SerializedName("avatarHash")
    String avatarHash;
    @SerializedName("avatarSource")
    String avatarSource;
    @SerializedName("bio")
    String bio;
    @SerializedName("bioData")
    String bioData;
    @SerializedName("confirmed")
    boolean confirmed;
    @SerializedName("email")
    String email;
    @SerializedName("fullName")
    String fullName;
    @SerializedName("gravatarHash")
    String gravatarHash;
    @SerializedName("id")
    String id;
    @SerializedName("idBoards")
    ArrayList<String> idBoards;
    @SerializedName("idBoardsPinned")
    boolean idBoardsPinned;
    @SerializedName("idEnterprise")
    boolean idEnterprise;
    @SerializedName("idEnterprisesAdmin")
    String[] idEnterprisesAdmin;
    @SerializedName("idOrganizations")
    ArrayList<String> idOrganizations;
    @SerializedName("idPremOrgsAdmin")
    ArrayList<String> idPremOrgsAdmin;
    @SerializedName("initials")
    String initials;
    @SerializedName("loginTypes")
    String loginTypes;
    @SerializedName("memberType")
    String memberType;
    @SerializedName("oneTimeMessagesDismissed")
    ArrayList<String> oneTimeMessagesDismissed;
    @SerializedName("prefs")
    ObjUserPref prefs;
    @SerializedName("premiumFeatures")
    ArrayList<String> premiumFeatures;
    @SerializedName("products")
    ArrayList<String> products;
    @SerializedName("status")
    String status;
    @SerializedName("trophies")
    ArrayList<String> trophies;
    @SerializedName("uploadedAvatarHash")
    String uploadedAvatarHash;
    @SerializedName("url")
    String url;
    @SerializedName("username")
    String username;

    HashMap<String, ObjSimpleBoard> boards;

    public HashMap<String, ObjSimpleBoard> getBoards() {
        if (boards==null) {
            boards=new HashMap<String, ObjSimpleBoard>();
        }
        return boards;
    }

    public void setBoards(HashMap<String, ObjSimpleBoard> boards) {
        this.boards = boards;
    }

    public String getAvatarHash() {
        return avatarHash;
    }

    public void setAvatarHash(String avatarHash) {
        this.avatarHash = avatarHash;
    }

    public String getAvatarSource() {
        return avatarSource;
    }

    public void setAvatarSource(String avatarSource) {
        this.avatarSource = avatarSource;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBioData() {
        return bioData;
    }

    public void setBioData(String bioData) {
        this.bioData = bioData;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGravatarHash() {
        return gravatarHash;
    }

    public void setGravatarHash(String gravatarHash) {
        this.gravatarHash = gravatarHash;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getIdBoards() {
        return idBoards;
    }

    public void setIdBoards(ArrayList<String> idBoards) {
        this.idBoards = idBoards;
    }

    public boolean isIdBoardsPinned() {
        return idBoardsPinned;
    }

    public void setIdBoardsPinned(boolean idBoardsPinned) {
        this.idBoardsPinned = idBoardsPinned;
    }

    public boolean isIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(boolean idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public String[] getIdEnterprisesAdmin() {
        return idEnterprisesAdmin;
    }

    public void setIdEnterprisesAdmin(String[] idEnterprisesAdmin) {
        this.idEnterprisesAdmin = idEnterprisesAdmin;
    }

    public ArrayList<String> getIdOrganizations() {
        return idOrganizations;
    }

    public void setIdOrganizations(ArrayList<String> idOrganizations) {
        this.idOrganizations = idOrganizations;
    }

    public ArrayList<String> getIdPremOrgsAdmin() {
        return idPremOrgsAdmin;
    }

    public void setIdPremOrgsAdmin(ArrayList<String> idPremOrgsAdmin) {
        this.idPremOrgsAdmin = idPremOrgsAdmin;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getLoginTypes() {
        return loginTypes;
    }

    public void setLoginTypes(String loginTypes) {
        this.loginTypes = loginTypes;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public ArrayList<String> getOneTimeMessagesDismissed() {
        return oneTimeMessagesDismissed;
    }

    public void setOneTimeMessagesDismissed(ArrayList<String> oneTimeMessagesDismissed) {
        this.oneTimeMessagesDismissed = oneTimeMessagesDismissed;
    }

    public ObjUserPref getPrefs() {
        return prefs;
    }

    public void setPrefs(ObjUserPref prefs) {
        this.prefs = prefs;
    }

    public ArrayList<String> getPremiumFeatures() {
        return premiumFeatures;
    }

    public void setPremiumFeatures(ArrayList<String> premiumFeatures) {
        this.premiumFeatures = premiumFeatures;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<String> getTrophies() {
        return trophies;
    }

    public void setTrophies(ArrayList<String> trophies) {
        this.trophies = trophies;
    }

    public String getUploadedAvatarHash() {
        return uploadedAvatarHash;
    }

    public void setUploadedAvatarHash(String uploadedAvatarHash) {
        this.uploadedAvatarHash = uploadedAvatarHash;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ObjUser{" +
                "avatarHash='" + avatarHash + '\'' +
                ", avatarSource='" + avatarSource + '\'' +
                ", bio='" + bio + '\'' +
                ", bioData='" + bioData + '\'' +
                ", confirmed=" + confirmed +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gravatarHash='" + gravatarHash + '\'' +
                ", id='" + id + '\'' +
                ", idBoards=" + idBoards +
                ", idBoardsPinned=" + idBoardsPinned +
                ", idEnterprise=" + idEnterprise +
                ", idEnterprisesAdmin=" + Arrays.toString(idEnterprisesAdmin) +
                ", idOrganizations=" + idOrganizations +
                ", idPremOrgsAdmin=" + idPremOrgsAdmin +
                ", initials='" + initials + '\'' +
                ", loginTypes='" + loginTypes + '\'' +
                ", memberType='" + memberType + '\'' +
                ", oneTimeMessagesDismissed=" + oneTimeMessagesDismissed +
                ", prefs=" + prefs +
                ", premiumFeatures=" + premiumFeatures +
                ", products=" + products +
                ", status='" + status + '\'' +
                ", trophies=" + trophies +
                ", uploadedAvatarHash='" + uploadedAvatarHash + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", boards=" + boards +
                '}';
    }
}
