package _05_Arrays;



import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        //TODO. Write you code below this line.
        int length = inhabitants.length;
        int[] inhabitants1 = new int[length];
        input.close();
        for (int i = 1; i < length - 1; i++) {
            inhabitants1[i] = inhabitants[i];
        }

        int totalOfAll;
        int counter = 0;
        do {
            System.out.println("Day " + counter + " " + Arrays.toString(inhabitants));
            totalOfAll = 0;
            if (inhabitants[1] == 0) {
                inhabitants[0] = inhabitants[0] / 2;
            }
            if (inhabitants1[length - 2] == 0) {
                inhabitants[length - 1] = inhabitants[length - 1] / 2;
            }
            for (int i = 1; i < length - 1; i++) {

                if (inhabitants1[i - 1] == 0 || inhabitants[i + 1] == 0) {

                    inhabitants[i] = inhabitants[i] / 2;
                }

                totalOfAll += inhabitants[i] + inhabitants[0] + inhabitants[length - 1];
            }

            for (int i = 1; i < length - 1; i++) {
                inhabitants1[i] = inhabitants[i];
            }
            counter++;

        } while (totalOfAll != 0);
        System.out.println("Day " + counter + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

    }
}
