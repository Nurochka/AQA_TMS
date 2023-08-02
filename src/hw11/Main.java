package hw11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Student, Integer> students = new HashMap<Student, Integer>();

        addStudent(students, "Hanna", 9);
        addStudent(students, "Dima", 5);
        addStudent(students, "Lena", 10);
        addStudent(students, "Olga", 7);
        addStudent(students, "Egor", 3);

        printAll(students);

        System.out.println("Количество студентов: " + numberOfStudents(students));

        System.out.println("Студент с низшим балом " + worstStudent(students));

    }


    // метод для добавления студента
    public static void addStudent(Map<Student, Integer> students, String name, int mark) {
        students.put(new Student(name), mark);
    }

    //вывести всех студентов
    public static void printAll(Map<Student, Integer> students) {
        System.out.println(students);
    }

    //вывести количество студентов
    public static int numberOfStudents(Map<Student, Integer> students) {
        Set<Student> names = students.keySet();
        return names.size();
    }

    //вывести самого худшего студента
    public static String worstStudent(Map<Student, Integer> students) {
        Collection<Integer> marks = students.values();
        int minMark = Collections.min(marks);

        for (Map.Entry<Student, Integer> person : students.entrySet()) {
            if (minMark == person.getValue()) {
                String name = person.getKey().getName();
                return name;
            }
        }

        return null;
    }
}

