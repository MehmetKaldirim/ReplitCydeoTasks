package _04_Loops;

public class EvenNumbers80To20 {
    public static void main(String[] args) {

        for (int i = 80; i >= 20; i--) {
            if (i % 2 == 0 && i != 20) {
                System.out.print(i + " ");
            }
        }
        System.out.print(20);
    }
}
