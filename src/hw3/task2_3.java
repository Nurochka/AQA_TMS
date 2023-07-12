package hw3;
/*3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
        элементов массива.*/

import java.util.Arrays;
import java.util.Random;

public class task2_3 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
                sum += arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println("сумма элементов массива " + sum);
    }
}




