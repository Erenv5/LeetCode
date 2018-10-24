package PalindromeString;

/**
 * 最大回文子串
 */
public class MaxChildPalString {

    /**
     * 返回最大子串的长度
     * 枚举法
     * @param S
     * @return
     */
    static int findMaxNum (String S) {
        int max = 0;
        int childMax = 0;

        for (int i=1; i<S.length()-1; i++) {
            //奇数子串
            for (int j=1; i-j>=0 && i+j<S.length(); j++) {
                if (S.charAt(i-j) == S.charAt(i+j)) {
                    childMax =2*j+1;
                } else
                    break;
            }

            if (childMax > max) {
                max = childMax;
                childMax = 0;
            }

            //偶数子串
            for (int k=1; i-k>=0 && i+k-1<S.length(); k++) {
                if (S.charAt(i-k) == S.charAt(i+k-1)) {
                    childMax = 2*k;
                } else
                    break;
            }

            if (childMax > max) {
                max = childMax;
                childMax = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxNum("1maam123"));
    }
}
