package com.genspark.SpringBootDemoApp.Entity;

public class Course {
    public int c_id;
    public String c_name;
    public String c_author;
    public Course(){
    }
    public Course(int id, String name, String author){
        c_id = id;
        c_name = name;
        c_author = author;
    }

    public int getC_id(){
        return c_id;
    }

    public String getC_name(){return c_name;}
    public String getC_author(){return c_author;}

    public void setC_name(String name){
        c_name = name;
    }

    public void setC_author(String author){
        c_author = author;
    }
}
