package com.company.factory;

public class PrintableFactory {

    public Printable getPrintable(){
        return new HelloPrintable();
    }
}
