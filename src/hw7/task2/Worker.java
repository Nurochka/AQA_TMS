package hw7.task2;

public class Worker implements Printable{
    String position;

    public Worker(String position) {
        this.position = position;
    }

    @Override
    public void print() {
        System.out.println(this.position);
    }
}
