package hw3;
/*0. Создать трехмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
        заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
        задается из консоли.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2_0 {
    public static void main(String[] args) {
        int a[][][] = new int[5][2][3];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = random.nextInt(10);
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите целое число, на которе будет увеличен каждый элемент массива");
        int n;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    for (int k = 0; k < a[i][j].length; k++) {
                        a[i][j][k] += n ;
                    }
                }
            }
            System.out.println(Arrays.deepToString(a));
        } else {
            System.out.println("Неверный ввод!");
        }
    }
}


