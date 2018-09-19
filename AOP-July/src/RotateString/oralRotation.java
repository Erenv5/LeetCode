package RotateString;

public class oralRotation {
    /**
     * 链表翻转。给出一个链表和一个数k，比如，链表为1→2→3→4→5→6，k=2，
     * 则翻转后2→1→6→5→4→3，若k=3，翻转后3→2→1→6→5→4，
     * 若k=4，翻转后4→3→2→1→6→5，用程序实现。
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
        System.out.println(reverseString(new char[]{'1','2','3'},0,1));
    }
}
