package _05_Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class AverageTemparature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        scan.close();
        System.out.println(Arrays.stream(temps).sum()/temps.length);//with stream
        System.out.println("--------------------------------------");
        double sum = 0;
        for (double value : temps) {
            sum += value;
        }
        System.out.println("average " + sum/temps.length);
    }
}

// average of temp