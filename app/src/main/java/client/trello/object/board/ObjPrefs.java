package client.trello.object.board;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nanik on 10/01/17.
 */
public class ObjPrefs {
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

    @SerializedName("background")
    String background;
    @SerializedName("backgroundBrightness")
    String backgroundBrightness;
    @SerializedName("backgroundColor")
    String backgroundColor;
    @SerializedName("backgroundImage")
    String backgroundImage;
    @SerializedName("backgroundImageScaled")
    String backgroundImageScaled;
    @SerializedName("backgroundTile")
    String backgroundTile;
    @SerializedName("calendarFeedEnabled")
    boolean calendarFeedEnabled;
    @SerializedName("canBeOrg")
    boolean canBeOrg;
    @SerializedName("canBePrivate")
    boolean canBePrivate;
    @SerializedName("canBePublic")
    boolean canBePublic;
    @SerializedName("canInvite")
    boolean canInvite;
    @SerializedName("cardCovers")
    boolean cardCovers;
    @SerializedName("comments")
    String  comments;
    @SerializedName("invitations")
    String invitations;
    @SerializedName("permissionLevel")
    String permissionLevel;
    @SerializedName("selfJoin")
    boolean selfJoin;
    @SerializedName("voting")
    String voting;

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackgroundBrightness() {
        return backgroundBrightness;
    }

    public void setBackgroundBrightness(String backgroundBrightness) {
        this.backgroundBrightness = backgroundBrightness;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getBackgroundImageScaled() {
        return backgroundImageScaled;
    }

    public void setBackgroundImageScaled(String backgroundImageScaled) {
        this.backgroundImageScaled = backgroundImageScaled;
    }

    public String getBackgroundTile() {
        return backgroundTile;
    }

    public void setBackgroundTile(String backgroundTile) {
        this.backgroundTile = backgroundTile;
    }

    public boolean isCalendarFeedEnabled() {
        return calendarFeedEnabled;
    }

    public void setCalendarFeedEnabled(boolean calendarFeedEnabled) {
        this.calendarFeedEnabled = calendarFeedEnabled;
    }

    public boolean isCanBeOrg() {
        return canBeOrg;
    }

    public void setCanBeOrg(boolean canBeOrg) {
        this.canBeOrg = canBeOrg;
    }

    public boolean isCanBePrivate() {
        return canBePrivate;
    }

    public void setCanBePrivate(boolean canBePrivate) {
        this.canBePrivate = canBePrivate;
    }

    public boolean isCanBePublic() {
        return canBePublic;
    }

    public void setCanBePublic(boolean canBePublic) {
        this.canBePublic = canBePublic;
    }

    public boolean isCanInvite() {
        return canInvite;
    }

    public void setCanInvite(boolean canInvite) {
        this.canInvite = canInvite;
    }

    public boolean isCardCovers() {
        return cardCovers;
    }

    public void setCardCovers(boolean cardCovers) {
        this.cardCovers = cardCovers;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getInvitations() {
        return invitations;
    }

    public void setInvitations(String invitations) {
        this.invitations = invitations;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public boolean isSelfJoin() {
        return selfJoin;
    }

    public void setSelfJoin(boolean selfJoin) {
        this.selfJoin = selfJoin;
    }

    public String getVoting() {
        return voting;
    }

    public void setVoting(String voting) {
        this.voting = voting;
    }

    @Override
    public String toString() {
        return "ObjPrefs{" +
                "background='" + background + '\'' +
                ", backgroundBrightness='" + backgroundBrightness + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", backgroundImage='" + backgroundImage + '\'' +
                ", backgroundImageScaled='" + backgroundImageScaled + '\'' +
                ", backgroundTile='" + backgroundTile + '\'' +
                ", calendarFeedEnabled=" + calendarFeedEnabled +
                ", canBeOrg=" + canBeOrg +
                ", canBePrivate=" + canBePrivate +
                ", canBePublic=" + canBePublic +
                ", canInvite=" + canInvite +
                ", cardCovers=" + cardCovers +
                ", comments='" + comments + '\'' +
                ", invitations='" + invitations + '\'' +
                ", permissionLevel='" + permissionLevel + '\'' +
                ", selfJoin=" + selfJoin +
                ", voting='" + voting + '\'' +
                '}';
    }
}
