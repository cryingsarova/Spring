package com.company;

import java.util.HashMap;
import java.util.Map;

public class SalaryManager {

    private Map<String,String> salaries = new HashMap();

    public void setSalaries(Map<String, String> salaries) {
        this.salaries = salaries;
    }

    public void getAllSalaries(){

        for (String key: salaries.keySet() ) {
            System.out.println("Person: "+key+", salary: "+salaries.get(key));
        }
    }

}
