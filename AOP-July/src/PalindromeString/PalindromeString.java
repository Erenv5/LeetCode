package PalindromeString;

import myUtils.SingleChain;

/**
 * 回文判断
 */
public class PalindromeString {

    private static Character[] charsToC(char[] chars) {
        Character[] characters = new Character[chars.length];
        for(int i=0; i<chars.length; i++) {
            characters[i] = chars[i];
        }
        return characters;
    }

    public static void main(String[] args) {
        char[] chars = "helloworld".toCharArray();
//        Character[] characters = charsToC(chars);
        SingleChain<Character> singleChain = new SingleChain<Character>(charsToC(chars));
        System.out.println(singleChain.toString());
    }
}
