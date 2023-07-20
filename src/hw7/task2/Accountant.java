package hw7.task2;

public class Accountant implements Printable{
    String position;

    public Accountant(String position) {
        this.position = position;
    }

    @Override
    public void print() {
        System.out.println(this.position);
    }
}
