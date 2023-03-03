package org.example;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String mob;

    public Phone(String mob) {
        this.mob = mob;
    }

    public String toString(){
        return "Phone Number: " + mob;
    }
}
