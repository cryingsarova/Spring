package com.company.factory;

public class HelloPrintable implements Printable {
    @Override
    public void print() {
        System.out.println("Hello!");
    }
}
