package hw6.lesson6;

public class Main {
    public static void main(String[] args) {
        //Truck truck = new Truck(123, "test", 200);
        Car car = new Car();
        Car car1 = new Truck();
        Car car2 = new Bus();

        car.testMethod();
        car1.testMethod();
        car2.testMethod();

        if(car1 instanceof Truck) {
            Truck truck = (Truck) car1;// приведение типов
            truck.getVolume();
        }
    }
}
