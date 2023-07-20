package hw5.dop1;

public class Ram {
    String name;
    int size;

    Ram(){

    }

    Ram(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
