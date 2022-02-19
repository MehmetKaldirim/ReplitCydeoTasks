package _03_String;

import java.util.Scanner;

public class CarInsuranceQuote {
    static double premium = 0;
    static int zipCode = 0;
    static int accidentsAmount = 0;
    static int age = 0;
    static int daysDrivenToWorkOrSchool = 0;
    static int milesToWorkOrSchool = 0;
    static String vehicleOwnership = "";
    static String vehicleUsage = "";
    static String continuousInsurance = "";
    static String education = "";
    static String name = "";
    static String haveDriver = "";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //DO NOT CHANGE
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.nextLine();
        haveDriverLicense();
        zipCode();
        isOwner();
        whyUsed();
        yourAge();
        drivingExprience();
        lastYear();
        educationLevel();
        printQuote();
    }

    private static void haveDriverLicense() {
        System.out.println("Do you have a US driver license?");
        haveDriver = scan.next();
        if (haveDriver.equalsIgnoreCase("No")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }
    }

    private static void zipCode() {
        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }

    }

    private static void isOwner() {
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if (vehicleOwnership.equalsIgnoreCase("Owned")) {
            premium += 10;
        } else {
            premium += 20;
        }
    }

    private static void whyUsed() {
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10;
        } else {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium += daysDrivenToWorkOrSchool * 5;
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool * 1;
        }
    }

    private static void yourAge() {
        System.out.println("How old are you?");
        age = scan.nextInt();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age < 18) {
            premium = premium * 20;
        } else if (age < 22) {
            premium = premium * 6;
        } else if (age < 25) {
            premium = premium * 2;
        }
    }

    private static void drivingExprience() {
        System.out.println("How many years you've been driving?");
        int driverYear = scan.nextInt();
        if (driverYear <= 0 || age - driverYear < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else {
            premium -= driverYear * 5;
        }
    }

    private static void isAccidents() {
        System.out.println("Have you had any accidents in the last 5 years?");
        String accidents = scan.next();
        if (accidents.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += (premium * 0.2) * accidentsAmount;
        }
    }

    private static void lastYear() {
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")) {
            premium *= 2;
        }
    }

    private static void educationLevel() {
        System.out.println("What is the highest level of education you have completed?");
        scan.nextLine();
        education = scan.nextLine();
        if (education.equalsIgnoreCase("PhD") ||
                education.equalsIgnoreCase("Bachelors") ||
                education.equalsIgnoreCase("Masters")) {
            premium -= premium * 0.05;

        } else if (education.equalsIgnoreCase("Doctors")) {
            premium -= premium * 0.10;

        } else {
            premium += premium * 0.05;
        }
    }

    private static void printQuote() {
        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        System.out.println("Reference number: " + name.substring(0, 2).
                toUpperCase() + age + "" + name.substring(name.length() - 2).
                toUpperCase() + "" + zipCode + "" + (education).toUpperCase().replace(" ", ""));

    }
}