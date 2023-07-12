package hw3;

import java.util.Arrays;

/*
5. Создайте массив и заполните массив.
        Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль.
        Снова выведете массив на экран на отдельной строке.
*/
public class task1_5 {
    public static void main(String[] args) {
        int arr[] = {5, 9, 16, -7, 2, 17};
        System.out.println("Ваш массив:" + Arrays.toString(arr));
        for (int i = 1; i<arr.length; i+=2){
            arr[i] = 0;
        }
        System.out.println("Ваш новый массив:" + Arrays.toString(arr));
    }
}
