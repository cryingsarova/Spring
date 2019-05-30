package com.company;

public class Car {

    public Passenger createPassenger(){
        return null;
    }

    public void drive(String name ){
        Passenger passenger = createPassenger();
        passenger.setName(name);
        System.out.println(passenger.getName()+" is in the car");
    }
}
