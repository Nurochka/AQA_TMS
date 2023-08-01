package hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Brackets {
    public static final char br1 = '[';
    public static final char br11 = ']';
    public static final char br2 = '{';
    public static final char br22 = '}';
    public static final char br3 = '(';
    public static final char br33 = ')';

    static List<Character> bracketTypes = List.of(br1, br11, br2, br22, br3, br33);

    public static void main(String[] args) {
        //String input = "[3ab{_}c25]s(no)";
        String input = "[3ab{_}c25]s(no))";
        System.out.println(extractBrackets(input));
        System.out.println(isValidBrackets(extractBrackets(input)));

    }

    public static List<Character> extractBrackets(String input) {
        List<Character> chars = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            chars.add(ch);
        }
        chars.retainAll(bracketTypes);
        return chars;
    }

    public static boolean isValidBrackets(List<Character> chars) {
        boolean result = true;
        if (chars.size() % 2 != 0) {
            result = false;
        } else {
            int[] arr = new int[bracketTypes.size()];
            for (int i = 0; i < bracketTypes.size(); i++) {
                int k = 0;
                for (int j = 0; j < chars.size(); j++) {
                    if (bracketTypes.get(i) == chars.get(j)) {
                        k++;
                    }
                }
                arr[i] = k;
            }
            for (int i = 0; i <= arr.length - 2; i = i + 2) {
                if (arr[i]!=arr[i+1]){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}