package hw6.Phone;

public class Phone {
    private int number;
    private String model;
    private float weight;

    Phone(){

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number){
        System.out.println("Звонит " + name + " " + number);
    }

    public void sendMessage(int...n){
        for (int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
