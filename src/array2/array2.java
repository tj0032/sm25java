package array2;

import java.util.Arrays;
import java.util.Random;

public class array2 {
    public static void main(String[] args) {
        int arr[][] = new int [3][3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = random.nextInt(10)+1;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr[0]));

        for (int n[]: arr) {
            for(int num: n){
                System.out.println(num+" ");
            }
            System.out.println();
        }







    }
}
