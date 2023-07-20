package hw7.task1;
/*Основное задание
        1. Написать иерархию классов «Фигуры».
        Фигура -> Треугольник -> Прямоугольник -> Круг.
        Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
        периметра.
        Создать массив из 5 фигур.
        Вывести на экран сумму периметра всех фигур в массиве.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Figure arr[] = new Figure[5];
        int arr2[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner((System.in));
            Random random = new Random();
            System.out.println("Enter type of figure: Circle, Triangle или Rectangle");
            String f;
            if (scanner.hasNextLine()) {
                f = scanner.nextLine();
                if (f.equals("Circle")){
                arr[i] = new Circle(random.nextInt(10));
                }else if(f.equals("Triangle")){
                    arr[i] = new Triangle(random.nextInt(20), random.nextInt(20), random.nextInt(20));
                }else if(f.equals("Rectangle")){
                    arr[i] = new Rectangle(random.nextInt(15), random.nextInt(15));
                } else {
                    System.out.println("Wrong type!");  //+ можно добавить еще попытку ввода
                }
            }
            arr2[i] = arr[i].perimetr();

        }
        int result = Arrays.stream(arr2).sum();
        System.out.println(Arrays.toString(arr));
        System.out.println(result);

    }
}
