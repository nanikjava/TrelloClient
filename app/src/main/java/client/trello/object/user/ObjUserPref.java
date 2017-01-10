package client.trello.object.user;

import com.google.gson.annotations.SerializedName;

import client.trello.object.ObjTrello;

/**
 * Created by nanik on 10/01/17.
 */

public class ObjUserPref extends ObjTrello{

    //        "prefs": {
//        "colorBlind": false,
//                "locale": "en-US",
//                "minutesBeforeDeadlineToNotify": 1440,
//                "minutesBetweenSummaries": 1,
//                "sendSummaries": true
//    },
    @SerializedName("colorBlind")
    boolean colorBlind;
    @SerializedName("locale")
    String locale;
    @SerializedName("minutesBeforeDeadlineToNotify")
    long minutesBeforeDeadlineToNotify;
    @SerializedName("minutesBetweenSummaries")
    int minutesBetweenSummaries;
    @SerializedName("sendSummaries")
    boolean sendSummaries;

    public boolean isColorBlind() {
        return colorBlind;
    }

    public void setColorBlind(boolean colorBlind) {
        this.colorBlind = colorBlind;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public long getMinutesBeforeDeadlineToNotify() {
        return minutesBeforeDeadlineToNotify;
    }

    public void setMinutesBeforeDeadlineToNotify(long minutesBeforeDeadlineToNotify) {
        this.minutesBeforeDeadlineToNotify = minutesBeforeDeadlineToNotify;
    }

    public int getMinutesBetweenSummaries() {
        return minutesBetweenSummaries;
    }

    public void setMinutesBetweenSummaries(int minutesBetweenSummaries) {
        this.minutesBetweenSummaries = minutesBetweenSummaries;
    }

    public boolean isSendSummaries() {
        return sendSummaries;
    }

    public void setSendSummaries(boolean sendSummaries) {
        this.sendSummaries = sendSummaries;
    }

    @Override
    public String toString() {
        return "ObjUserPref{" +
                "colorBlind=" + colorBlind +
                ", locale='" + locale + '\'' +
                ", minutesBeforeDeadlineToNotify=" + minutesBeforeDeadlineToNotify +
                ", minutesBetweenSummaries=" + minutesBetweenSummaries +
                ", sendSummaries=" + sendSummaries +
                '}';
    }
}
