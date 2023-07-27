package hw8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        String login = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
        System.out.println("Confirm password: ");
        String confirmPassword = scanner.next();
        boolean res;
        try {
            res = LoginPage.validation(login, password, confirmPassword);
            System.out.println(res);

        } catch (WrongLoginException loginException) {
            System.out.println(loginException.getMessage());

        } catch (WrongPasswordException passwordException) {
            System.out.println(passwordException.getMessage());
        }
    }
}
