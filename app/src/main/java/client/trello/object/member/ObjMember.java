package client.trello.object.member;

import client.trello.object.ObjTrello;

/**
 * Created by nanik on 10/01/17.
 */

public class ObjMember extends ObjTrello {
    public ObjMember() {
        baseURI = new String("/members/me/");
    }
}
