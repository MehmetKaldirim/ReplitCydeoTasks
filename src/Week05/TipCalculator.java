package Week05;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Split:");
        String isSplit = sc.next();
        System.out.println("Number of people:");
        int numberOfPerson = sc.nextInt();
        System.out.println("Check amount:");
        double price = sc.nextDouble();
        System.out.println("Service Quality:");
        String serQuality =sc.next();
        Double tip= 0.0;
        String pAnd="&";
        pAnd = pAnd.repeat(numberOfPerson);

        switch(serQuality) {

            case "Poor" :
                tip += price * 5 / 100;
                break;

            case "Fair" :
                tip += price * 10 / 100;
                break;

            case "Good" :
                tip += price * 15 / 100;
                break;

            case "Great" :
                tip += price * 20 / 100;
                break;

            case "Excellent" :
                tip += price * 25 / 100;
                break;
        }
        double totalPrice = price + tip;

        System.out.println("Number of people entered: " + pAnd);
        System.out.println("Total to pay: " + totalPrice);
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + totalPrice/numberOfPerson);
        System.out.println("Tip per person: " + tip/numberOfPerson);
    }
}
