package hw7.task1;

public class Rectangle extends Figure {
    private int a; //сторона прямоугольника
    private int b; //сторона прямоугольника

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int area() {
        int s = this.a*this.b;
        return s;
    }

    @Override
    public int perimetr() {
        int p = 2*(this.a+this.b);
        return p;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
