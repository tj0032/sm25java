package variable;

public class var1 {
    public static void main(String args[]){
        // 정수는 int
        int intNum = 2100000000; // 32bit 4byte
        long doubleNum = 2100000000L; // 6bit 8byte

        byte b1 = 100;
        byte b2 = 100;
        byte b3 = (byte) (b1+b2);
        System.out.println(b3);

        int num1 = 150000000;
        int num2 = 150000000;
        int result = num1 + num2;
        System.out.println(result);

        // 실수 double
        float f1 = 100000000.0F;
        float f2 = 100000000.0F;
        float f3 = f1 + f2;
        //float f4 = 100000000.0D; x

        System.out.printf("%f",f3);
        double d1 = 1000000.0;











    }



}
