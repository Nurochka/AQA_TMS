package hw9;
/*1. Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
 - Вывести на экран в одну строку два первых блока по 4 цифры.
 - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
 - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
 - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
 - Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 - Проверить начинается ли номер документа с последовательности 555.
 - Проверить заканчивается ли номер документа на последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.*/

public class Methods {

    public static String methodConcat(String str) {
        String[] parts = str.split("-");
        String newStr = parts[0] + parts[2];
        return newStr;
    }


    public static String methodReplace(String str) {
        String[] parts = str.split("-");
        String newStr1 = str.replace(parts[1], "***");
        String newStr2 = newStr1.replace(parts[3], "***");
        return newStr2;
    }


    public static String methodOnlyLetters(String str) {
        String[] parts = str.split("-");
        char[] chars = parts[4].toCharArray();
        String newStr = parts[1] + "/" + parts[3] + "/" + chars[1] + "/" + chars[3];
        return newStr;
    }

    public static String methodOnlyLetters2(String str) {
        StringBuilder builder = new StringBuilder("Letters:");
        builder.append(methodOnlyLetters(str));
        return builder.toString();
    }

    public static void methodContains(String str) {
        String subString = "abc";
        if (str.toLowerCase().contains(subString)) {
            System.out.println("Номер документа содержит abc");
        } else {
            System.out.println("Номер документа не содержит abc");

        }
    }

    public static void methodStartsWith(String str) {
        String subString = "555";
        if (str.startsWith(subString)) {
            System.out.println("Номер документа начинается с " + subString);
        } else {
            System.out.println("Номер документа не начинается с " + subString);

        }
    }

    public static void methodEndsWith(String str) {
        String subString = "1a2b";
        if (str.endsWith(subString)) {
            System.out.println("Номер документа заканчивается на " + subString);
        } else {
            System.out.println("Номер документа не заканчивается на " + subString);
        }
    }

}


