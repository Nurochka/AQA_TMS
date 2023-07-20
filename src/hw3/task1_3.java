package hw3;
/*3. Создайте 2 массива из 5 чисел.
        Выведите массивы на консоль в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и
        сообщите, для какого из массивов это значение оказалось больше (либо
        сообщите, что их средние арифметические равны).*/

import java.util.Arrays;

public class task1_3 {
    public static void main(String[] args) {
        int arr1[] = {5, 9, 16, -7, 2};
        int arr2[] = {11, 27, -3, 0, -10};
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("Ваш первый массив:" + Arrays.toString(arr1));
        System.out.println("Ваш второй массив:" + Arrays.toString(arr2));
        for (int i = 0; i<arr1.length; i++){
            sum1 +=arr1[i];
            sum2 +=arr2[i];
        }
        float avarage1 = (float) sum1/ arr1.length;
        float avarage2 = (float) sum2/ arr2.length;
        //System.out.println(avarage2);
        //System.out.println(avarage1);
        if (avarage1 != avarage2){
            if (avarage1 > avarage2){
                System.out.println("Среднее арифметическое первого массива больше, чем второго массива");
            }
            else {
                System.out.println("Среднее арифметическое второго массива больше, чем первого массива");
            }
        }else{
            System.out.println("Среднее арифметическое первого и второго массива равны");
        }

    }
}
