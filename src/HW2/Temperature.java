package HW2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        // написать программу для вывода "Тепло", "Нормально", "Холодно" в зависимости от температуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature outside:");
        String temp = scanner.next();
        int temp2 = Integer.parseInt(temp);
        if (temp2 > -5) {
            System.out.println("Тепло");
        } else if ((-5 >= temp2) & (temp2 > -20)) {
            System.out.println("Нормально");
        } else if (temp2 <= -20) {
            System.out.println("Холодно");
        }
    }
}

