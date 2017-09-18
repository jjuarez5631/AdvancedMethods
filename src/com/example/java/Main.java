package com.example.java;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        int customerType;
        String customerName, businessName;
        String customerNumber;

        Scanner input = new Scanner(System.in);
            //while loop check for a valid input from user.
        do {
            System.out.println("What type of customer are you?");
            System.out.println("1. Residential");
            System.out.println("2. Business");
            customerType = input.nextInt();
                //methods will be called depending which case is selected.
                //same name for the methods but different parameters are used.
            switch (customerType) {
                case 1:
                    System.out.println("Enter your Name: ");
                    customerName = input.next();
                    System.out.println("Enter Your phone number: ");
                    customerNumber = input.next();

                    displayInfo(customerName, customerNumber);
                    break;
                case 2:
                    System.out.println("Enter your Business Name: ");
                    businessName = input.next();
                    System.out.println("Enter your name: ");
                    customerName = input.next();
                    System.out.println("Enter Your phone number: ");
                    customerNumber = input.next();

                    displayInfo(businessName, customerName, customerNumber);
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    System.out.println("");
            }
        } while (customerType < 1 || customerType > 2);
    }
        // method is for residential information display
    public static void displayInfo(String Name, String Phone) {
        System.out.println("");
        System.out.println("Name: " + Name);
        System.out.println("Phone: " + Phone);
    }
        //method is for business information display.
    public static void displayInfo(String Business, String Name, String Phone) {
        System.out.println("");
        System.out.println("Business: " + Business);
        System.out.println("Name: " + Name);
        System.out.println("Phone: " + Phone);
    }
}
