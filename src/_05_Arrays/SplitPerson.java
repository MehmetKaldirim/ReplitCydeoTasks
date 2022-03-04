package _05_Arrays;

import java.util.Scanner;

public class SplitPerson {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    String s = inp.next();
    inp.close();
    person(s) ;
}

    public static void person(String info) {
        //your code here
        String[] arr = info.split(",");
        System.out.printf("person name: %s\nlast name: %s\nage: %s",arr[0],arr[1],arr[2] );
    }

}
/*The method person has a string arguement with this format: "name,last name,age". Print out the person's information

Example:

person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
hint: use the split method to split the string to a string array where there is a "," char*/