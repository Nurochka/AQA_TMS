package hw3;
/*5. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
        двумерного массива по возрастанию.*/

import java.util.Arrays;
import java.util.Random;

public class task2_5 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println(Arrays.deepToString(arr));
    }

}


