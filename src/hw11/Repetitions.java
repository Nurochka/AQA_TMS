package hw11;

import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        List<Integer> list = createList(8);
        System.out.println(list);

        numberOfEntries(list);

        numberOfRepetitions(list);
    }


    public static List<Integer> createList(int size) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int el = (int) (Math.random() * 10);
            list.add(el);
        }
        return list;
    }

    public static void numberOfIntRepetitions(List<Integer> list) {
        Set<Integer> distinct = new HashSet<>(list);
        for (Integer el : distinct) {
            System.out.println(el + ": " + Collections.frequency(list, el));
        }
    }

    public static void numberOfEntries(List<Integer> list) {
        Set<Integer> distinct = new HashSet<>(list);
        for (Integer el : distinct) {
            System.out.println(el + ": " + Collections.frequency(list, el));
        }
    }

    public static void numberOfRepetitions(List<Integer> list) {
        Set<Integer> distinct = new HashSet<>(list);
        int k = 0;
        for (Integer el : distinct) {
            k = k + (Collections.frequency(list, el)-1);
        }
        System.out.println("Общее количество повторений: " + k);
    }

}
