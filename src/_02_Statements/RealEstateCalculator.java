package _02_Statements;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numBed, spotGarage;
        float metro, school, highway;
        boolean isBackyard, isSmoking, isGarage;
        String pType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE


        System.out.println("Enter your property type:");
        pType = scan.nextLine();

        switch (pType) {

            case "Condo":
                propertyPrice = 50000;

                System.out.println("How many bedrooms do you have?");
                numBed = scan.nextInt();
                propertyPrice += numBed * 30000;

                System.out.println("Do you have a backyard?");
                isBackyard = scan.nextBoolean();

                if (isBackyard) {
                    System.out.println("Backyard is not available for condo!");
                } else return;

                System.out.println("Do you have garage?");
                isGarage = scan.nextBoolean();

                if (isGarage) {
                    System.out.println("How many spots");
                    spotGarage = scan.nextInt();

                    if (spotGarage > 10) {
                        System.out.println("Pardon, it's not public parking");
                    } else {
                        propertyPrice += spotGarage * 20000;
                    }
                }

                System.out.println("How close is metro station?");
                metro = scan.nextFloat();
                if (metro <= 1) {
                    propertyPrice += 10000;
                } else if (metro > 1 && metro <= 3) {
                    propertyPrice += 5000;
                } else return;
                System.out.println("How close is highway?");

                highway = scan.nextFloat();
                if (highway <= 1) {
                    propertyPrice += 15000;
                } else if (highway > 1 && highway <= 5) {
                    propertyPrice += 8000;
                } else if (highway > 5 && highway <= 20) {
                    propertyPrice += 4000;
                } else return;

                System.out.println("What's the rating of nearest school?");
                school = scan.nextFloat();

                if (school <= 10 && school >= 8) {
                    propertyPrice += 45000;
                } else if (school < 8 && school >= 4) {
                    propertyPrice += 20000;
                } else {
                    propertyPrice += 5000;
                }
                System.out.println("Does any of your family members smoke?");
                isSmoking = scan.nextBoolean();

                if (isSmoking) {
                    propertyPrice -= 5000;
                }
                break;

            case "Townhouse":
                propertyPrice = 75000;

                System.out.println("How many bedrooms do you have?");
                numBed = scan.nextInt();
                propertyPrice += numBed * 30000;

                System.out.println("Do you have a backyard?");
                isBackyard = scan.nextBoolean();

                if (isBackyard) {
                    propertyPrice += 5000;
                }

                System.out.println("Do you have garage?");
                isGarage = scan.nextBoolean();

                if (isGarage) {
                    System.out.println("How many spots");
                    spotGarage = scan.nextInt();

                    if (spotGarage > 10) {
                        System.out.println("Pardon, it's not public parking");
                    } else {
                        propertyPrice += spotGarage * 20000;
                    }
                }

                System.out.println("How close is metro station?");
                metro = scan.nextFloat();

                if (metro <= 1) {
                    propertyPrice += 10000;
                } else if (metro > 1 && metro <= 3) {
                    propertyPrice += 5000;
                } else return;

                System.out.println("How close is highway?");
                highway = scan.nextFloat();

                if (highway <= 1) {
                    propertyPrice += 15000;
                } else if (highway > 1 && highway <= 5) {
                    propertyPrice += 8000;
                } else if (highway > 5 && highway <= 20) {
                    propertyPrice += 4000;
                } else return;

                System.out.println("What's the rating of nearest school?");
                school = scan.nextFloat();
                if (school <= 10 && school >= 8) {
                    propertyPrice += 45000;
                } else if (school < 8 && school >= 4) {
                    propertyPrice += 20000;
                } else {
                    propertyPrice += 5000;
                }

                System.out.println("Does any of your family members smoke?");
                isSmoking = scan.nextBoolean();

                if (isSmoking) {
                    propertyPrice -= 5000;
                }
                break;

            case "Single Family Home":
                propertyPrice = 95000;
                System.out.println("How many bedrooms do you have?");
                numBed = scan.nextInt();
                propertyPrice += numBed * 30000;

                System.out.println("Do you have a backyard?");
                isBackyard = scan.nextBoolean();

                if (isBackyard) {
                    propertyPrice += 5000;
                }

                System.out.println("Do you have garage?");
                isGarage = scan.nextBoolean();

                if (isGarage) {
                    System.out.println("How many spots");
                    spotGarage = scan.nextInt();

                    if (spotGarage > 10) {
                        System.out.println("Pardon, it's not public parking");
                    } else {
                        propertyPrice += spotGarage * 20000;
                    }
                }

                System.out.println("How close is metro station?");
                metro = scan.nextFloat();

                if (metro <= 1) {
                    propertyPrice += 10000;
                } else if (metro > 1 && metro <= 3) {
                    propertyPrice += 5000;
                } else return;

                System.out.println("How close is highway?");
                highway = scan.nextFloat();
                if (highway <= 1) {
                    propertyPrice += 15000;
                } else if (highway > 1 && highway <= 5) {
                    propertyPrice += 8000;
                } else if (highway > 5 && highway <= 20) {
                    propertyPrice += 4000;
                } else return;

                System.out.println("What's the rating of nearest school?");
                school = scan.nextFloat();

                if (school <= 10 && school >= 8) {
                    propertyPrice += 45000;
                } else if (school < 8 && school >= 4) {
                    propertyPrice += 20000;
                } else {
                    propertyPrice += 5000;
                }

                System.out.println("Does any of your family members smoke?");
                isSmoking = scan.nextBoolean();

                if (isSmoking) {
                    propertyPrice -= 5000;
                }
                break;
        }
        scan.close();
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");
    }
}