package hw9;

import java.util.Arrays;
import java.util.Scanner;

public class Unique {
    public static final String DELIMETR = " ";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(DELIMETR);

        System.out.println(Arrays.toString(words));
        if (words.length ==0){
            System.out.println("Incorrect input");
            return;
        }
        else if (words.length == 1){
            System.out.println("Result" + words[0]);
            return;
        }

        String min = words[0];
        System.out.println(calculateUniqueSymbol(words[0]));

    }

    public static int calculateUniqueSymbol(String str){
        char[] uniqueSymbols = new char[str.length()];
        int uniqueSymCounter = 1;
        uniqueSymbols[0] = str.charAt(0);

        for (char symbol: str.substring(1).toCharArray()){
            boolean unique = true;
            for (int i = 0; i<uniqueSymCounter; i++){
                if (symbol == uniqueSymbols[i]){
                    unique = false;
                    break;
                } if (unique){
                    uniqueSymbols[uniqueSymCounter] = symbol;
                    uniqueSymCounter++;
                }
            }

        }

        return uniqueSymCounter;
    }


}
