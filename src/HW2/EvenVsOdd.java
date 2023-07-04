package HW2;

import java.util.Scanner;

public class EvenVsOdd {
    // написать программу для вывода четное/нечетное число
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");
        String number = scanner.next();
        if (Integer.parseInt(number) % 2 == 0) {
            System.out.println("Your number " + number + " is even");
        } else {
            System.out.println("Your number " + number + " is odd");
        }
    }
}
