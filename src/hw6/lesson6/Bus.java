package hw6.lesson6;

public class Bus extends Car {
    private int placesAmount;

    Bus() {

    }
@Override
    public void testMethod(){
        System.out.println("Bus Test");
    }

    public Bus(int placesAmount) {
        this.placesAmount = placesAmount;
    }

    public int getPlacesAmount() {
        return placesAmount;
    }

    public void setPlacesAmount(int placesAmount) {
        this.placesAmount = placesAmount;
    }
}
