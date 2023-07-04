package HW2;

public class Season2 {
    public static void main(String[] args) {
        // написать программу для вывода поры года по номеру месяца if else if
        int i = 6;
        if (i == 12 || i == 1 || i == 2) {
            System.out.println("winter");
        } else if (i == 3 || i == 4 || i == 5) {
            System.out.println("spring");
        } else if (i == 6 || i == 7 || i == 8) {
            System.out.println("summer");
        } else if (i == 9 || i == 10 || i == 11) {
            System.out.println("winter");
        } else {
            System.out.println("There is no such a season. Please check number!");

        }
    }

}
