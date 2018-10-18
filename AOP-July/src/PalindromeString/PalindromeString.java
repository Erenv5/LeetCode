package PalindromeString;

import myUtils.SingleChain;
import myUtils.SingleChainItem;

import java.util.LinkedList;

/**
 * 回文判断
 */
public class PalindromeString {


    /**
     * 从 char 数组转为 Character 数组
     * @param chars
     * @return
     */
    private static Character[] charsToC(char[] chars) {
        Character[] characters = new Character[chars.length];
        for(int i=0; i<chars.length; i++) {
            characters[i] = chars[i];
        }
        return characters;
    }

    private static boolean palString (String S) {
        return false;
    }

    /**
     * 判断一个单向链是否回文
     * @param list
     * @return
     */
    private static boolean palSingleChain (LinkedList list) {
        int m = (list.size()-1)/2 + 1;
        int n,s;
        int length = (list.size()-1)/2+list.size();
        for(n=m; n<length; n+=2) {
            list.add(m,list.get(n));
        }

        for(n=0,s=m; n<m-1; n++,s++) {
            if(!list.get(n).equals(list.get(s)) ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        Character[] characters = charsToC(chars);
//        SingleChain<Character> singleChain = new SingleChain<Character>(charsToC(chars));
//        System.out.println(singleChain.toString());

//        SingleChainItem<Character> singleChainItem = new SingleChainItem<Character>('c');
//        SingleChainItem<Character> singleChainItem1 = new SingleChainItem<Character>('b');
//        singleChainItem.setNext(singleChainItem1);




        char[] chars = "madam".toCharArray();
        LinkedList<Character> linkedList = new LinkedList<Character>();
        for(Character c : chars) {
            linkedList.add(c);
        }
        System.out.println(palSingleChain(linkedList));

    }
}
