package operation;

public class op3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        char c = 0;

        if(a > b){
            c = 'T';
        } else {
            c = 'F';
        }
        System.out.println(c);


        // 삼향 연산자로 구현 하시오
        c = (a > b) ? 'T':'F';
        System.out.println(c);







    }
}
