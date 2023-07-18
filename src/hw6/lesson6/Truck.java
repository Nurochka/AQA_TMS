package hw6.lesson6;

import hw6.lesson6.Car;

public class Truck extends Car {
    private int volume;

    public Truck(){
        super();
    }

    public Truck(int volume, String vin, int maxSpeed) {
        super(vin, maxSpeed);
        this.volume = volume;
    }
@Override
    public void testMethod(){

        System.out.println("Truck Test");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
