package control;

public class control2 {
    public static void main(String[] args) {
        // 1~10까지의 합과 평균을
        // for문을 이용하여 구하시오

        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            count++;
            // sum += count;
        }


        avg = Double.valueOf(sum)/count;
        System.out.println(sum/count);
        System.out.printf("%d, %5.2f", sum, avg);


    }

}
