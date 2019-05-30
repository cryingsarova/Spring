package com.company;

import java.util.HashMap;
import java.util.Map;

public class BirthdayManager {

    private Map<String,String> birthDays = new HashMap();

    public BirthdayManager(Map<String, String> birthDays) {
        this.birthDays = birthDays;
    }

    public void getAllBirthdays(){
        for (String key: birthDays.keySet()) {
            System.out.println("Person: "+key+", birthday: "+birthDays.get(key));
        }
    }
}
