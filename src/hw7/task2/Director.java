package hw7.task2;

public class Director implements Printable{
    String position;

    public Director(String position) {
        this.position = position;
    }

    @Override
    public void print() {
        System.out.println(this.position);

    }
}
