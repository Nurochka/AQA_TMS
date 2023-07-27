package hw9;

import java.util.Scanner;

import static hw9.Methods.*;


public class Main {
    public static void main(String[] args) {
        String regex = "^\\d{4}-[a-zA-Z]{4}-\\d{4}-[a-zA-Z]{4}-[0-9][a-zA-Z][0-9][a-zA-Z]$";

        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.");
        String str = scanner.nextLine();
        if(str.matches(regex)){
        System.out.println(methodConcat(str));
        System.out.println(methodReplace(str));
        System.out.println(methodOnlyLetters(str));
        System.out.println(methodOnlyLetters2(str));
        methodContains(str);
        methodStartsWith(str);
        methodEndsWith(str);
        } else{
            System.out.println("Неверный ввод!");
        }
    }
}
