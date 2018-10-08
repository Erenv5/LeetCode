package RotateString;

public class oralRotation {
    /**
     * 翻转字符串，开始和最后
     * iloveyou -> evoliyou
     *
     *
     * @param chars
     * @param from  开始
     * @param to    最后
     * @return
     */
    static private char [] reverseStringByFromAndTo(char [] chars, int from, int to){
        while(from < to) {
            char t = chars[from];
            chars[from++] = chars[to];
            chars[to--] = t;
        }
        return chars;
    }

    /**
     * 在原字符串中把字符串尾部的 m 个字符移动到字符串的头部
     * iloveyou -> evoliuoy -> youilove
     *
     *
     * 由于 String 的缘故，空间复杂度较高
     * @param A 字符串
     * @param m 尾部字符个数
     * @return
     */
    static private String twoPartsReverse (String A, int m){
        if(A.length() < m) {
            return "参数错误";
        }
        int n = A.length() - m;
//        String s = new String(reverseString(A.substring(0,n).toCharArray(),0,n-1));
//        System.out.println(s);

        return new String (reverseStringByFromAndTo(
                (
                new String (reverseStringByFromAndTo(A.substring(0,n).toCharArray(),0,n-1)) +
                        new String (reverseStringByFromAndTo(A.substring(n,A.length()).toCharArray(),0,m-1))
                ).toCharArray(),0,A.length()-1));
    }


    /**
     * 将字符串翻转，返回翻转结果
     * love -> evol
     *
     *
     * @param S 需要翻转的字符串
     * @return
     */
    static private String reverseString(String S) {
        char[] chars = S.toCharArray();
        int from = 0;
        int to = chars.length;
        while(from < to) {
            char t = chars[from];
            chars[from++] = chars[to];
            chars[to--] = t;
        }
        return new String(chars);
    }

    /**
     * 使用 StringBuilder
     * 把一个句子根据空格旋转，单词内字符顺序不变，按照普通字母一样处理
     * I am a student. -> student. am a I
     *
     *
     * 思路：
     *      1. 分割为不同的字符串，然后入栈出栈
     *      2. 旋转每个小字符串后旋转整个大字符串，小字符串的字母交换通过 StringBuider 实现
     * @param S
     * @return
     */
    static private StringBuilder reverseSentence(String S) {
        StringBuilder result = new StringBuilder(S);
        int i = 0, b = i;
        for(; i<=result.length(); i++) {
            // 根据空格遍历出每个小字符串
            if(i == result.length() || result.charAt(i) == ' ') {
               // 找到一个字符串，旋转
                reverseEveryWord(result,b,i-1);
                b = i + 1;
            }
        }
        //最后再转一遍
        reverseEveryWord(result,0,result.length()-1);
        return result;
    }

    /**
     * 在 StringBuffer 中从 from 开始到 to 之间的字符串进行翻转
     * （包括 from 和 to 所在位置对应的字符）
     * loving you -> gnievol you
     *
     *
     * @param S
     * @param from
     * @param to
     */
    static private void reverseEveryWord(StringBuilder S, int from, int to) {
        for(; from < to; from++,to--) {
            char c = S.charAt(from);
            S.setCharAt(from,S.charAt(to));
            S.setCharAt(to, c);
        }
    }

    /**
     * play
     * StringBuilder / StringBuffer
     * @param
     * @return
     */
    static private String sentenceReverse(String S) {


        if(S == null || S.length() == 0)
            return "";

        StringBuilder stringBuilder = new StringBuilder(S);


        int length = S.length();
        int count = 0;
        int sign = count;
        String result = "";
        while(count < length) {
            if(S.charAt(count) == ' ') {
                result = result + reverseString(S.substring(sign,count-1));
                sign = count;
            }

            count++;
        }
        return "asd";
    }

    public static void main(String[] args) {
//        char [] chars = new char[]{'1','2','3'};
//        System.out.println(reverseString(new char[]{'1','2','3'},0,2));

        // 翻转字符串两部分
//        System.out.println(twoPartsReverse("Ilovebaofeng",7));

        // 翻转句子
        System.out.println(reverseSentence("congraduations for you guys"));

    }
}
