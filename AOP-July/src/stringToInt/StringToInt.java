package stringToInt;

import static java.lang.Float.NaN;

/**
 * 字符串转整数
 *
 * 思考：
 * 1. 整数有正负，所以首先需要判断符号
 * 2. 整数只是数字，所以要判断字符是否非法
 * 3. 整型有取值范围，所以要控制溢出
 */
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
