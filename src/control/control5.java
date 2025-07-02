package control;

public class control5 {
    public static void main(String[] args) {
        // 1~10까지의 짝수 합과 평균을
        // while문을 이용하여 구하시오

        int sum = 0;
        double avg = 0.0;
        int num = 1;
        int cnt = 0;

        while (num <= 10) {
            if(num%2==0) {
                sum += num;
                cnt++;
            }
            num++;
        }

        avg = sum * 1.0 / num;
        System.out.printf("%d, %5.2f", sum, avg);


    }

}
