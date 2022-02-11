package Week05.String;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        sc.close();
        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf("_")).toLowerCase();

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("_") + 2).toUpperCase() +
                email.substring(email.indexOf("_") + 2, email.indexOf("@")).toLowerCase();

        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
    }
}