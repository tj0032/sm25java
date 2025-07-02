package variable;

public class st1 {
    public static void main(String[] args) {
        // Reference Type ... Primitive Type x
        // Reference => Class Object
        String st1 = new String("abc");
        String st2 = new String("abc");

        String st3 = "abc";
        String st4 = "abc";

        if( st1 == st2){
            System.out.println("OK1");
        }
        if( st1 == st3){
            System.out.println("OK2");
        }
        if( st3 == st4){
            System.out.println("OK3");
        }

        if(st1.equals(st2)){
            System.out.println("OK4");
        }
        if(st1.equals(st3)){
            System.out.println("OK5");
        }

    }
}
