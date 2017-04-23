package com.service.chatservice;

import java.util.Calendar;

/**
 * Created by User on 20.04.2017.
 */
public class TestObject {
    private Calendar time;
    private String message;

    public TestObject(Calendar time, String message) {
        this.time = time;
        this.message = message;
    }

    public TestObject() {
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {

    }
}
