package client.trello.object.board;

import com.google.gson.annotations.SerializedName;

import client.trello.object.ObjTrello;

/**
 * Created by nanik on 10/01/17.
 */

public class ObjMembership extends ObjTrello {
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
    @SerializedName("deactivated")
    boolean deactivated;

    @SerializedName("id")
    String        id;

    @SerializedName("idMember")
    String idMember;

    @SerializedName("memberType")
    String        memberType;

    @SerializedName("unconfirmed")
    boolean unconfirmed;


    public boolean isDeactivated() {
        return deactivated;
    }

    public void setDeactivated(boolean deactivated) {
        this.deactivated = deactivated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public boolean isUnconfirmed() {
        return unconfirmed;
    }

    public void setUnconfirmed(boolean unconfirmed) {
        this.unconfirmed = unconfirmed;
    }

    @Override
    public String toString() {
        return "ObjMembership{" +
                "deactivated=" + deactivated +
                ", id='" + id + '\'' +
                ", idMember='" + idMember + '\'' +
                ", memberType='" + memberType + '\'' +
                ", unconfirmed=" + unconfirmed +
                '}';
    }
}
