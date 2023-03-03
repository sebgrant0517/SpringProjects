package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public String toString(){
        return "Student: " + name + " ID: " + id + " " + ph + " " + add;
    }
}
