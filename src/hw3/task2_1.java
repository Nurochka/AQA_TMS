package hw3;

import java.util.Arrays;
import java.util.Random;

/*1. Шахматная доска
        Создать программу для раскраски шахматной доски с помощью цикла.
        Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
        циклам значения B(Black) или W(White). Результат работы программы:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W*/
public class task2_1 {
    public static void main(String[] args) {
        String a[][] = new String[8][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i % 2 > 0) {
                    if (j % 2 > 0) {
                        a[i][j] = "W";
                    } else {
                        a[i][j] = "B";
                    }
                } else if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        a[i][j] = "W";
                    } else {
                        a[i][j] = "B";
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

}

