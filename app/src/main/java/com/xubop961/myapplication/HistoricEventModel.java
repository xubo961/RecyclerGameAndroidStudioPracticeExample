package com.xubop961.myapplication;

public class HistoricEventModel {
    public String eventName;
    public String eventQuest1;
    public String eventQuest2;
    public String eventQuest3;

    public HistoricEventModel(String eventName, String eventQuest1, String eventQuest2, String eventQuest3) {
        this.eventName = eventName;
        this.eventQuest1 = eventQuest1;
        this.eventQuest2 = eventQuest2;
        this.eventQuest3 = eventQuest3;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String geteventQuest1() {
        return eventQuest1;
    }

    public void seteventQuest1(String eventQuest1) {
        this.eventQuest1 = eventQuest1;
    }

    public String geteventQuest2() {
        return eventQuest2;
    }

    public void seteventQuest2(String eventQuest2) {
        this.eventQuest2 = eventQuest2;
    }

    public String getEventQuest3() {
        return eventQuest3;
    }

    public void setEventQuest3(String eventQuest3) {
        this.eventQuest3 = eventQuest3;
    }
}
