package hw5;
/*1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую
        сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
        Напишите программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма
        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек.*/

public class CreditCard {
    int accountNumber;
    float currentSum;

    // конструктор
    CreditCard(int accountNumber, float currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    //зачислить
    void enrollMoney(float sum) {
        if (sum > 0) {
            this.currentSum += sum;
            System.out.println("Вы зачислили " + sum + " на счет N" + this.accountNumber);
        }
        else {
            System.out.println("Неверная сумма");
        }
    }

    //снять
    void withdrawMoney(float sum) {
        if (sum <= this.currentSum) {
            this.currentSum -= sum;
            System.out.println("Вы сняли " + sum + " со счета N" + this.accountNumber);
        }
        else {
            System.out.println("Недостаточно средств");
        }
    }

    // вывести инфу
    void cardInfo() {
        System.out.println("Номер счета N: " + this.accountNumber + ", Сумма на счете: " + this.currentSum);
    }
}

