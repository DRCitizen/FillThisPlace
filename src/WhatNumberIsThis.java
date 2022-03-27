import java.util.Scanner;

public class WhatNumberIsThis {
    public static void main(String [] args){

        //Let's take input from the user
        //Began Scanning For Threats
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int num = sc.nextInt();
        //Officer Please Run a Plate Check
        String check = (num % 2 == 0) ? "even" : "odd";

        System.out.println("The entered number "+ num + " is: " + check);


    }

}
