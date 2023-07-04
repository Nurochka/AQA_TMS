package HW2;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        // по введенному номеру отпределить цвет радуги
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number for rainbow color");
        String color = scanner.next();
        switch (color) {
            case "1":
                System.out.println("красный");
                break;
            case "2":
                System.out.println("оранжевый");
                break;
            case "3":
                System.out.println("желтый");
                break;
            case "4":
                System.out.println("зеленый");
                break;
            case "5":
                System.out.println("голубой");
                break;
            case "6":
                System.out.println("сидит");
                break;
            case "7":
                System.out.println("фиолетовый");
                break;
            default:
                System.out.println("Please recheck the entered number!");
        }
    }
}
