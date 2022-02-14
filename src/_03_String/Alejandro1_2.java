package _03_String;

import java.util.Scanner;

public class Alejandro1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        s.close();
        //your code here
        System.out.println(a.contains("alejandro") && a.contains("project") ? "read" : "don't read" );

    }
}

/*Alejandro has many emails and only has time to read the emails that refer to him.
Check if his name and "project" is found in the email and if it does print "read",
but if his name is not in the email print "don't read"*/
