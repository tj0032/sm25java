package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {
        String [] strs = new String[3];
        strs[0] = "a";
        strs[1] = "b";
        strs[2] = "c";
        System.out.println(Arrays.toString(strs));

        StringBuffer sb = new StringBuffer();
        for(String s:strs){
            sb.append(s);
        }
        System.out.println(sb);



    }
}
