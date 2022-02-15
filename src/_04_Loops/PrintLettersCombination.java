package _04_Loops;

public class PrintLettersCombination {
    public static void main(String[] args) {
        String newCombination;
        String allCombination ="";
        int counter = 0;
        for (char i ='z'; i >= 'v' ; i--) {
            for (char j = 'z'; j >= 'v' ; j--) {
                newCombination = "" + i + j;
                if(!allCombination.contains(newCombination)){
                    allCombination += newCombination + " ";
                    System.out.println(newCombination);
                    counter++;
                }
            }

        }
        System.out.println("Amount of combination is "+ counter);
    }

}
/*Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:

zz

zy

zx

zw

zv

yz

....

vv*/