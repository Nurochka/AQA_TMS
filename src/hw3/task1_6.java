package hw3;

/*6. Создайте массив строк. Заполните его произвольными именами людей.
        Отсортируйте массив. Pезультат выведите на консоль.*/

import java.util.Arrays;

public class task1_6{
    public static void main(String[] args) {
        String arr[] = {"Vasia", "Hanna", "Maria", "Vasilisa"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


