package com.company.figures;

import org.springframework.beans.factory.annotation.Qualifier;

public class PrintSquare{

    private Square square;

    public PrintSquare(Square square) {
        this.square = square;
    }

    public void showSquare(){
        System.out.println(square);
    }
}
