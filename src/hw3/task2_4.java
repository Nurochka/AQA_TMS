package hw3;

/*4. Создайте двумерный массив. Выведите на консоль диагонали массива.*/

import java.util.Arrays;
import java.util.Random;

public class task2_4 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Главная диагональ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println("Побочная диагональ");
        int k = arr.length - 1; //диагональ есть у квадратной матрицы;
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i][k]);
            k--;
        }
    }
}

