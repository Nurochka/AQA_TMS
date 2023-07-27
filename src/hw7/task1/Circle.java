package hw7.task1;

public class Circle implements Figure {
    private int r; //радиус круга

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int area() {
        int s = (int)(Math.PI*Math.pow(this.r, 2));
        return s;

    }

    @Override
    public int perimetr() {
        int p = (int)(2*Math.PI*this.r);
        return p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
