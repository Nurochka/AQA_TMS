package hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.*/

public class task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите количество элементов массива");
        int len;
        if (scanner.hasNextInt()) {
            len = scanner.nextInt();
            int arr[] = new int[len];
            //заполнянем массив
            for (int i = 0; i < len; i++) {
                int r = (int) (Math.random() * 100);
                arr[i] = r;
            }
            //максимальное, минимальное, среднее значение
            int max = arr[0];
            int min = arr[0];
            int sum = 0;
            if (arr != null && arr.length > 1) {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                    sum += arr[i];
                }
                int avarage = sum / len;
                System.out.println("Ваш массив:" + Arrays.toString(arr));
                System.out.println("Максимальное, минимальное и среднее значение соответственно равны: " + max + ", " + min + ", " + avarage);
            } else {
                System.out.println("В массиве недостаточно элементов для сравнения!");
            }

        } else {
            System.out.println("Неверный ввод!");
        }
    }
}
