package operation;

public class op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;


        // 3수의 최대 값과 최소 값을 구하시오
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);























    }
}
