package com.company;

import java.util.Scanner;

public class Main {
//Where is the unknown file?
    public static void main(String[] args) {
        Scanner sysin = new Scanner(System.in);
        System.out.println("What is the name of the person you want a lucky number for?");
        String name = sysin.nextLine();
        person unknown = new person(name);
        unknown.welcomeStats();
        while(true) {
            System.out.println("What would you like to do? Change name, change number, or are you done?");
            String res = sysin.nextLine();
            if (res.toLowerCase().contains("name")) {
                System.out.println("What name would you like to change to?");
                unknown.newName(sysin.nextLine());
                unknown.welcomeStats();
            }
            if (res.toLowerCase().contains("number")) {
                unknown.newNum();
                unknown.printStats();
            }
            if(res.toLowerCase().contains("done")) {
                System.out.println("Have a nice day!");
                System.exit(1);
            }
        }
    }
}
