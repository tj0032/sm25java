package control;

import java.util.Random;
import java.util.Scanner;

public class control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter Command: (arr1, arr2, arr3)");
            String cmd = sc.nextLine();
            if(cmd.equals("q")) {
                System.out.println("quit");
                break;
            } else if(cmd.equals("arr1")) {
                System.out.println("숫자를 입력하세요(1~10):");
                String num1 = sc.nextLine();
                System.out.println("숫자를 입력하세요(1~10):");
                String num2 = sc.nextLine();
                System.out.printf("input number %s %s \n", num1, num2);
                System.out.printf("Plus: %s \n", num1 + num2);
                int n1 =  Integer.parseInt(num1);
                int n2 =  Integer.parseInt(num2);
                System.out.printf("add: %d \n", n1 + n2);

            } else if(cmd.equals("arr2")) {
                // 한개의 1~10까지의 숫자를 입력 받는다.
                // 해당 사이즈의 1차원 배열을 생성한다.
                // 배열에 랜덤하게 1~10까지의 값을 입력 한다. 중복 되지 않게 입력
                // 1. 배열값을 출력하고
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력

                System.out.println("숫자를 입력하세요(1~10):");
                String num1 = sc.nextLine();
                int arr1 = Integer.parseInt(num1);

                int arr[] = new int[arr1];
                Random rand = new Random();

                for (int i = 0; i < arr.length; i++) {
                    int rNum = rand.nextInt(10)+1;
                    boolean flag = false;

                    for (int j = 0; j < i; j++) {
                        if (arr[j] == rNum) {
                            flag = true;
                            break;
                        }
                    }

                    if (flag) {
                        i--;
                        continue;
                    }

                    arr[i] = rNum;
                }
                System.out.print("배열 값 : ");
                for (int n : arr) {
                    System.out.print(n + " ");
                }
                System.out.println();

                int sum = 0;
                for (int n : arr) {
                    sum += n;
                }

                double avg = (double) sum / arr.length;
                System.out.printf("합계: %d, 평균: %.2f\n", sum, avg);

                int max = arr[0];
                int min = arr[0];
                for (int n : arr) {
                    if (n > max) max = n;
                    if (n < min) min = n;
                }

                System.out.printf("최대값: %d, 최소값: %d\n", max , min);
            }
            else if(cmd.equals("arr3")) {
                // 두개의 1~10까지의 숫자를 입력 받는다.
                // 해당 사이즈의 2차원 배열을 생성한다.
                // 배열에 랜덤하게 1~30까지의 값을 입력 한다. 중복 되지 않게 입력
                // 1. 배열값을 출력하고
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력
                System.out.println("숫자를 입력하세요(1~10):");
                String num1 = sc.nextLine();
                int arr1 = Integer.parseInt(num1);
                System.out.println("숫자를입력하세요(1~10):");
                String num2 = sc.nextLine();
                int arr2 = Integer.parseInt(num2);

                int arr[][] = new int [arr1][arr2];
                Random rand = new Random();

                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        int rNum = rand.nextInt(10)+1;
                        boolean flag = false;

                        for (int k = 0; k < i; k++) {
                            if (arr[i][k] == rNum) {
                                flag = true;
                                break;
                            }
                        if (flag) {

                        }
                        }
                    }

                }









            } else {
                System.out.println("command");
            }

        }
        sc.close();
    }

}

