package HW2;

import java.util.Scanner;

public class BankPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        String s = scanner.next();
        float sum = Integer.parseInt(s);
        System.out.println("Введите количество месяцев:");
        String n = scanner.next();
        int month = Integer.parseInt(n);
        float value = 0;
        for (int i = 1; i <= month; i++) {
            value = (float) (sum*0.07);
            sum += value;
        }
        System.out.println("Cумма с процентами за " + month + " месяцев равна " + sum);
    }
}
