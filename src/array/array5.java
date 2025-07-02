package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        int arr [] = new int[5];
        Random rand = new Random();
        for(int i = 0 ; i < 5 ; i++){
            int num = rand.nextInt(10)+1;
            if(!Arrays.asList(arr).contains(num)){
                arr[i] = num;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).average().getAsDouble());





    }
}
