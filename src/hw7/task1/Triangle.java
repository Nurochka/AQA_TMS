package hw7.task1;

public class Triangle extends Figure {
    private int a; //сторона треугольника
    private int b; //сторона треугольника
    private int c; //сторона треугольника

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int area() {
        int pp = this.perimetr()/2;
        int s = (int)Math.sqrt(pp*(pp-this.a)*(pp-this.b)*(pp-this.c));
        return s;
    }

    @Override
    public int perimetr() {
        int p = this.a + this.b + this.c;
        return p;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
