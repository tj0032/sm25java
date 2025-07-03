package control;

import java.util.Scanner;

public class control6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter Command");
            String cmd = sc.nextLine();
            if(cmd.equals("q")) {
                System.out.println("quit");
                break;
            } else if(cmd.equals("i")){
                System.out.println("insert");
            } else if(cmd.equals("s")){
                System.out.println("ssss");
            } else if(cmd.equals("d")){
                System.out.println("delect");
            } else if(cmd.equals("u")){
                System.out.println("update");
            } else {
                System.out.println("command");
            }
        }
        sc.close();
    }
}
