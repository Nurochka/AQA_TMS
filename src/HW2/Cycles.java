package HW2;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        // вевести нечетные от 1 до 99; использовать ++
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // вевести числа от 5 до 1; использовать
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // последовательность Фибоначчи
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое :");
        String number = scanner.next();
        int num = Integer.parseInt(number);
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Cумма последовательности Фибоначчи для " + number + " равна " + sum);

        //вывести последовательность от 7 до 98 с шагом 7, использовать while
        int a = 7;
        while (a <= 98) {
            System.out.println(a);
            a += 7;
        }

        //вывести первые 10 цифр последовательность 0 -5 -10 -15 ...
        int b = 5;
        for (int i = 0; i < 10; i++) {
            b -= 5;
            System.out.println(b);
        }

        //квадраты от 10 до 20 включительно
        int sq = 10;
        while (sq <= 20) {
            System.out.println(sq*sq);
            sq++;
        }
    }
}

