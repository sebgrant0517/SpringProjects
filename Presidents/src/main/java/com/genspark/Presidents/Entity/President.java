package com.genspark.Presidents.Entity;

public class President {
    public int c_id;
    public String c_name;
    public String c_reason;

    public President(){

    }

    public President(int c_id, String c_name, String c_reason) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_reason = c_reason;
    }

    public int getC_id() {
        return c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public String getC_reason() {
        return c_reason;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setC_reason(String c_reason) {
        this.c_reason = c_reason;
    }
}
