package hw3;
/*1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        Пусть число задается с консоли (класс Scanner). Если такого числа нет -
        выведите сообщения об этом. В результате должен быть новый массив без указанного числа.*/

import java.util.Arrays;
import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        int arr[] = {11, 27, -3, 0, -9, 34, 27};
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите целое число для удаления из массива");
        int n;
        int k = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            for (int element : arr) {
                if (element == n) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("Введенное число в массив не входит!");
            } else {
                int a[] = new int[arr.length-k];
                int s = 0;
                for (int element : arr) {
                    if (element != n) {
                        a[s] = element;
                        s++;
                    }
                }
                System.out.println(Arrays.toString(a));
            }

        } else {
            System.out.println("Неверный ввод!");
        }
    }
}
