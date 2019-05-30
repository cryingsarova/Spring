package com.company;


import com.company.factory.Printable;
import com.company.figures.PrintCircle;
import com.company.figures.PrintRectangle;
import com.company.figures.PrintSquare;
import com.company.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.ref.SoftReference;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        System.out.println("----Задание 1 и 2----");
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println("----Задание 3 и 4----");
        Employee manager = (Employee) context.getBean("manager");
        Employee topManager = (Employee) context.getBean("topManager");
        Employee juniorAnalyst = (Employee) context.getBean("juniorAnalyst");//здесь выполняется 4 задание
        System.out.println(manager);
        System.out.println(topManager);
        System.out.println(juniorAnalyst);

        System.out.println("----Задание 2( использование Map )----");

        BirthdayManager birthdayManager = context.getBean("birthdayManager",BirthdayManager.class);
        SalaryManager salaryManager = context.getBean("salaryManager",SalaryManager.class);
        birthdayManager.getAllBirthdays();
        salaryManager.getAllSalaries();

        System.out.println("----Задание 5----");

        PrintCircle printCircle = (PrintCircle) context.getBean("printCircle");
        printCircle.showCircle();
        PrintRectangle printRectangle = (PrintRectangle) context.getBean("printRectangle");
        printRectangle.showRectangle();
        PrintSquare printSquare = (PrintSquare) context.getBean("printSquare");
        printSquare.showSquare();

        System.out.println("----Задание 6----");
        Printable printable = (Printable) context.getBean("printable");
        printable.print();
        System.out.println("----Задание 7----");
        Car car = context.getBean("car",Car.class);
        car.drive("Vasya");
        car.drive("Danya");
        car.drive("Kirill");



        context.close();

    }
}
