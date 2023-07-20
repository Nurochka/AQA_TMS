package hw6.lesson6.enums;

public enum DayofWeek {
    MONDAY("Monday"), TUESDAY("Thusday"), WEDNESDAY("Wednesday");
    private String name;

    DayofWeek(String name) {

        this.name = name;
    }

    public void testMethod() {
        System.out.println("123");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


