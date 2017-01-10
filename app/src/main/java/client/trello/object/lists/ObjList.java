package client.trello.object.lists;

import client.trello.object.ObjTrello;

/**
 * Created by nanik on 10/01/17.
 */

public class ObjList extends ObjTrello{

//    {"id":"587440e6206d107632ca536a","name":"First Melbourne List","closed":false,"idBoard":"587440db5252a52376d0f258","pos":65535,
// "subscribed":false
    String id;
    String name;
    boolean closed;
    String idBoard;
    String pos;
    boolean subscribed;

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

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    @Override
    public String toString() {
        return "ObjList{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", closed=" + closed +
                ", idBoard='" + idBoard + '\'' +
                ", pos='" + pos + '\'' +
                ", subscribed=" + subscribed +
                '}';
    }
}
