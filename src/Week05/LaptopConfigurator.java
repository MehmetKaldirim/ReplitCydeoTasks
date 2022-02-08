package Week05;

import java.util.Scanner;

public class LaptopConfigurator {

    public static void main(String[] args) {
        double price = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = sc.nextDouble();
        price += screenSize == 13.3 ? 200 :
                 screenSize == 15.0 ? 300 :
                 screenSize == 17.3 ? 400 :
                                0;
        System.out.println("Select CPU type:");
        String cpuType = sc.next();

        price += cpuType.equals("i3") ? 150 :
                 cpuType.equals("i5") ? 250 :
                 cpuType.equals("i7") ? 350 : 0;

        System.out.println("Select RAM size:");
        int ram = sc.nextInt();
        price += ram / 4 * 50;

        System.out.println("Select storage type:");
        String strType = sc.next();

        if (strType.equals("HDD")) {

            System.out.println("Enter memory size:");
            int memory = sc.nextInt();
            price += memory / 500 * 50;
        }

        if (strType.equals("SSD")) {

            System.out.println("Enter memory size:");
            int memory = sc.nextInt();
            price += memory / 500 * 100;
        }


        System.out.println("Enter screen resolution:");
        String scrResolution = sc.next();

        price += scrResolution.equals("FULLHD") ? 100 :
                scrResolution.equals("4K") ? 200 : 0;

        System.out.println("Laptop price is: $" + price);


    }
}
