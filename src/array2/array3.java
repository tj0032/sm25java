package array2;

import java.util.Arrays;
import java.util.Random;

public class array3 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // 1~100까지의 random 한 숫자를 입력한다.
        // 단, 중복 되서 들어가면 안된다.
        // 최종 배열을 출력

        int arr[][] = new int [5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(100)+1;
            }
        }


        System.out.println(Arrays.deepToString(arr));








    }
}
