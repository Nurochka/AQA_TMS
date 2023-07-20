package hw6.lesson6;

public class Car {
    private String vin;
    private int maxSpeed;

    //блок инициализации - вызываются до конструкторов (инициализации)
    {

    }

    public Car() {
    }

    public Car(String vin, int maxSpeed) {
        this.vin = vin;
        this.maxSpeed = maxSpeed;
    }

    public void testMethod() {
        System.out.println("Car Test");
    }

    public void testMethod(int Test) {
        System.out.println("Car Test");
    }

    public String getVin() {
        return vin;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
