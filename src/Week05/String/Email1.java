package Week05.String;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if (email.contains("_")) {
            System.out.println(email.substring(email.indexOf("_") + 1, email.indexOf("@")) + "_"
                    + email.substring(0, email.indexOf("_")) + email.substring(email.indexOf("@")));
        } else {
            System.out.println(email);
        }
        scan.close();
    }
}
