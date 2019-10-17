package com.my.pattern.observer.publishsubscribe;

public class Msg<M> {
    private String publisher;
    private M msg;

    public Msg() {
    }

    public Msg(String publisher, M msg) {
        this.publisher = publisher;
        this.msg = msg;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public M getMsg() {
        return msg;
    }

    public void setMsg(M msg) {
        this.msg = msg;
    }
}
