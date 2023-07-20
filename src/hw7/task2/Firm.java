package hw7.task2;
/*
2. Создать классы "Директор", "Рабочий", "Бухгалтер".
        Реализовать интерфейс с методом, который печатает название должности и
        имплементировать этот метод в созданные классы.
        Дополнительное задание
*/

public class Firm {
    public static void main(String[] args) {
        Director director = new Director("Директор");
        director.print();

    }
}
