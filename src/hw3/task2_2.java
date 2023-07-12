package hw3;

import java.util.Arrays;

/*2. Умножение двух матриц
        Создайте два массива целых чисел размером 3х3 (две матрицы).
        Напишите программу для умножения двух матриц.
        Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
        Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
        Ожидаемый результат: 1 2 3 1 1 1 0 0 0*/
public class task2_2 {
    public static void main(String[] args) {
        int a[][] = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int b[][] = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int res[][] = new int[a.length][b[0].length];
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < b[0].length; i++) {
                for (int j = 0; j < b.length; j++) {
                    res[k][i] += a[k][j] * b[j][i];
                }
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}