package _03_String;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        sc.close();
        String firstPart = "";
        String secondPart = "";
        String thirdPart = "";
        String result = "";

        if (email.contains("_")) {
            firstPart = email.substring(0, email.indexOf("_"));
            secondPart = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            thirdPart = email.substring(email.indexOf("@"));
            result = secondPart + "_" + firstPart + thirdPart;
        } else {
            result = email;
        }
        System.out.println(result);
    }
}
