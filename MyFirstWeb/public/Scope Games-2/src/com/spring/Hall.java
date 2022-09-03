package com.spring;

 

import java.util.ArrayList;
import java.util.List;
public class Hall {
    Integer width;
    Integer length;
    String owner;
    public List<Event> eventList;
    public Hall() {
        //fill your code
        System.out.println("...Creating Hall...");
        eventList=new ArrayList<Event>();
    }
    public List<Event> getEventList() {
        return eventList;
    }
    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public Integer getLength() {
        return length;
    }
    public void setLength(Integer length) {
        this.length = length;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}

 