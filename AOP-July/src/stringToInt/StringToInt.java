package stringToInt;

import static java.lang.Float.NaN;

public class StringToInt {

    static int strToInt(String s){
        int sign = 1;
        int i=0,j,result=0;

        //判断符号
        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            if(s.charAt(i) == '-')
                sign = -1;
            i++;
        }

        for(; i<s.length(); i++) {
            j = s.charAt(i) - 48;
            result = result*10 +j;

            //判断溢出
            if(sign == 1 && Integer.MAX_VALUE/10 > result) {
                return Integer.MAX_VALUE;
            }
            else if(sign == -1 && j-1 > Integer.MAX_VALUE/10 - result) {
                return Integer.MIN_VALUE;
            }
        }
        return sign*result;
    }

    public static void main(String[] args) {
        String S = "+27455";
        System.out.println(strToInt(S) );
    }
}
