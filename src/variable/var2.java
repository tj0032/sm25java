package variable;

public class var2 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int result = num1++ + ++num2;
        System.out.printf("%d %d %d", num1, num2, result);

    }
}
