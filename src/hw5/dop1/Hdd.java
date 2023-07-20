package hw5.dop1;

public class Hdd {
    String name;
    int size;
    String type;

    Hdd(){

    }

    Hdd(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
