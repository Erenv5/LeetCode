package RotateString;

public class oralRotation {
    /**
     * 翻转字符串，开始和最后
     * @param chars
     * @param from
     * @param to
     * @return
     */
    static char [] reverseString(char [] chars, int from, int to){
        while(from < to) {
            char t = chars[from];
            chars[from++] = chars[to];
            chars[to--] = t;
        }
        return chars;
    }

    static char [] remotingString(char [] chars, int m, int n){
        return chars;
    }

    public static void main(String[] args) {
//        char [] chars = new char[]{'1','2','3'};
        System.out.println(reverseString(new char[]{'1','2','3'},0,2));
    }
}
