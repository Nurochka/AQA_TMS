package hw3;

import java.util.Scanner;

/*0. Создайте массив целых чисел. Напишете программу, которая выводит
        сообщение о том, входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).*/

public class task1_0 {
    public static void main(String[] args) {
        int arr[] = {5, 9, 16, -7, 2, 0};
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите целое число для поиска");
        int n;
        int k = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            for (int element : arr) {
                if (element == n) {
                    System.out.println("Введенное число входит в массив");
                    break;
                }
                else {
                    k++;
                }
                if (k == arr.length){
                    System.out.println("Введенное число в массив НЕ входит!");
                }
            }
        } else {
            System.out.println("Неверный ввод!");
        }
    }
}
