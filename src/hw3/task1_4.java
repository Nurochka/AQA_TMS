package hw3;
/*
4. Создайте массив из n случайных целых чисел и выведите его на экран.
        Размер массива пусть задается с консоли и размер массива может быть
        больше 5 и меньше или равно 10.
        Если n не удовлетворяет условию - выведите сообщение об этом.
        Если пользователь ввёл не подходящее число, то программа должна
        просить пользователя повторить ввод.
        Создайте второй массив только из чётных элементов первого массива,
        если они там есть, и вывести его на экран.
*/

import java.util.Arrays;
import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите количество элементов массива от 6 до 10");
        int len;
        if (scanner.hasNextInt()) {
            len = scanner.nextInt();
            while (len <= 5 || len > 10) {
                System.out.println("Неверное число! Количество элементов массива должно быть от 6 до 10. Введите новое число");
                len = scanner.nextInt();
            }
            int arr[] = new int[len];
            for (int i = 0; i < len; i++) {
                int r = (int) (Math.random() * 100);
                arr[i] = r;
            }
            System.out.println("Ваш первый массив:" + Arrays.toString(arr));

            int k = 0;
            for (int element : arr) {
                if (element % 2 == 0) {
                    k++;
                }
            }
                if (k != 0) {
                    int[] arr2 = new int[k];
                    int n = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] % 2 == 0) {
                            arr2[n] = arr[j];
                            n++;
                        }
                    }
                    System.out.println("Ваш второй четный массив:" + Arrays.toString(arr2));
                } else {
                    System.out.println("Второй массив не может быть составлен, т.к. в первом нет четных элементов");
                }

        } else {
            System.out.println("Неверный ввод! Вводите числа от 6 до 10!");
        }
    }
}
