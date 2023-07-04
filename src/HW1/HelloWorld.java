package HW1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter name:");
        name = scanner.next();
        System.out.println("Hello " + name);
    }
}
