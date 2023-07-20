package hw5.dop1;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1500, "HP");
        System.out.println(computer1.toString());
        Computer computer2 = new Computer(2000, "Lenovo", new Ram("Intel", 32), new Hdd("Samsung", 1024, "внешний"));
        System.out.println(computer2.toString());

    }
}
