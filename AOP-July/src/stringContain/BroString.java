package stringContain;

import java.util.Arrays;

/**
 * 兄弟字符串
 * 如果两个字符串的字符一样，但是顺序不一样，被认为是兄弟字符串，
 * 比如bad和adb即为兄弟字符串，现提供一个字符串，如何在字典中迅速找到它的兄弟字符串，
 * 请描述数据结构和查询过程。
 *
 *
 * 解法：
 * 1. 从 B 中逐个拿出与 A 中字符逐个比较
 * 2. 字符串排序后再对二者依次轮询
 * 3. 质数相乘，可以整除就存在
 * 3. 把 A 的所有字符放在 Hashtable 里，然后轮询字符串 B
 */
public class BroString {

    /**
     * 自带排序
     * @param S
     * @return StringBuilder
     */
    private static void sortString (String S) {
        int i=0,j;
        StringBuilder a = new StringBuilder(S);
            for(j=1; j<a.length(); j++) {
                if(a.charAt(i) > a.charAt(j)) {
                    char b = a.charAt(i);
                    a.setCharAt(i,a.charAt(j));
                    a.setCharAt(j,b);
                    i = j;
                }
             }


    }


    /**
     * 1. 从 B 串中一个一个拿出来在A中比较
     * 缺点： 不能有重复字符
     * @param a
     * @param b
     * @return
     */
    private static boolean oneByOne(String a, String b) {
        if(a.length() != b.length())
            return false;
        int i,j;
        for(i=0; i<a.length(); i++) {
            for(j=0; j<b.length(); j++) {
                if(a.charAt(i) == b.charAt(j))
                    break;
                if(j == b.length()-1)
                    return false;
            }
        }
        return true;
    }

    /**
     * 先排序再轮询比较
     * @param a
     * @param b
     * @return
     */
    private static boolean afterSort (String a, String b) {
        int length = 0;
        if(a.length() != b.length())
            return false;

        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abvnmiuy";
        String b = "abnmuiyyv";
        char[] S = s.toCharArray();
        char[] B = b.toCharArray();
        Arrays.sort(B);
        Arrays.sort(S);
        System.out.println(new String(S));
        System.out.println(new String(B));
        System.out.println(afterSort(new String(S), new String(B)));
    }
}
