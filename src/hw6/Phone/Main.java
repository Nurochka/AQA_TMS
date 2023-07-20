package hw6.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(501501, "Samsung", 120);
        Phone phone2 = new Phone(502502, "Huawai", 170);
        Phone phone3 = new Phone(503503, "Xiaomi", 180);

        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        phone1.receiveCall("Дмитрий");
        System.out.println(phone1.getNumber());

        phone2.receiveCall("Алексей");
        System.out.println(phone2.getNumber());

        phone3.receiveCall("Анна");
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Сергей", 111111);
        phone2.receiveCall("Ольга", 222222);
        phone3.receiveCall("Светлана", 333333);

        phone1.sendMessage(555555, 666666, 777777);

    }
}
