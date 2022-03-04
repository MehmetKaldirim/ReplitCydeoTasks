package _05_Arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        input.close();
        if (email.contains("@")  && email.indexOf("@") != email.lastIndexOf("@")) {
            System.out.println("invalid email");
        } else {
            String arr[] =email.split("@");
            for (String word : arr) {
                System.out.print(word + " ");
            }

        }

    }
}

/*Given a String variable email, write code using split method to print email id
 and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email
email -> hello-gmail.com

Output:
invalid email
email -> my@fancy@email.com

Output:
invalid email*/