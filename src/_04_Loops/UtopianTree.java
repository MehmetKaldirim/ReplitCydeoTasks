package _04_Loops;

public class UtopianTree {
    public static void main(String[] args) {

        // your code
        int sizeThree =0;
        for(int i= 1;i <=10;i++){
            if(i<=3){
                sizeThree += 1;
                System.out.printf("year %d - growth 1 cm\n", i);
                System.out.printf("tree size: %dcm\n",sizeThree);

            } else {
                sizeThree += 2;
                System.out.printf("year %d - growth 2 cm\n", i);
                System.out.printf("tree size: %dcm\n",sizeThree);

            }
        }

    }
}

