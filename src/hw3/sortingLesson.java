package hw3;

import java.util.Arrays;

public class sortingLesson {
    public static void main(String[] args) {
        //пузырек
        int a[] = {4, 0, 5, 9, 1, 8, 9};
        int buf;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    buf = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        // вставками
        buf = 0;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                if (a[j] > a[j + 1]) {
                    buf = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
