package Week03;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {

        //WRITE YOUR CODE HERE:
        String report;
        double totalPrice, price1, price2, price3;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        String item2 = scan.next();
        price2 = scan.nextDouble();
        System.out.println("Enter Item3 and its price:");
        String item3 = scan.next();
        price3 = scan.nextDouble();;
        totalPrice = price1 +price2 +price3;

        System.out.printf("Item1: %s Price: %.1f, Item2: %s Price: %.1f, Item3: %s Price: %.1f\nTotal price: %.1f",item1,price1,item2,price2,item3,price3,totalPrice );

    }
}
/*Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3*/