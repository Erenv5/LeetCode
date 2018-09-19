package chapterOne;

/**
 * 旋转字符串
 * 给定两个字符串, A 和 B。
 *
 * A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后，A 能变成B，那么返回True。
 *
 * 示例 1:
 * 输入: A = 'abcde', B = 'cdeab'
 * 输出: true
 *
 * 示例 2:
 * 输入: A = 'abcde', B = 'abced'
 * 输出: false
 * 注意：
 *
 * A 和 B 长度不超过 100。
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 出错一次：
 *      先循环判断大小后判断长度
 *
 * 把更强的判断放在较弱判断后面
 *
 */
public class RotateString {

    public static boolean arrayJudge(char[] aChars, char[] bChars) {
        int judgeCount = 0;
        while(judgeCount < aChars.length) {
            if(aChars[judgeCount] == bChars[judgeCount])
                judgeCount++;
            else
                break;
        }
        if(judgeCount == aChars.length)
            return true;
        return false;
    }

    public static boolean rotateStirng(String A, String B){
        // 先转化成字符数组，判断是否相等，旋转循环长度次，相等返回
        char[] aChars,bChars;
        aChars = A.toCharArray();
        bChars = B.toCharArray();

        int aLength = aChars.length;
        int bLength = bChars.length;
        int count = 0;

        if(aLength == bLength) {

            if(arrayJudge(aChars,bChars)) {
                return true;
            }

            while(count < aLength) {

                // 旋转
                int from = 0;
                char temp = aChars[from];
                while(from < aLength-1) {
                    aChars[from] = aChars[++from];
                }
                aChars[aLength-1] = temp;

                // 判断
                if(arrayJudge(aChars,bChars)) {
                    return true;
                }

                count++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateStirng("aa","a"));
    }
}
