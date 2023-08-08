package hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hanna", 10, "111");
        Student student2 = new Student("Ivan", 7, "112");
        Student student3 = new Student("Olga", 5, "113");
        Student student4 = new Student("Dima", 8, "113");
        Student student5 = new Student("Sveta", 9, "113");
        Student student6 = new Student("Sveta", 4, "113");
        List<Student> students = List.of(student1, student2, student3, student4, student5);

        //вывести студентов с оценкой больше 8
        System.out.println(getStudentByMark(8, students));

        //список групп с минимальным количеством студентов
        System.out.println(getGroupWithMinStudents(students, collectUniqueGroups(getListOfGroups(students))));

    }

    public static List<Student> getStudentByMark(int mark, List<Student> students) {
        List<Student> resultList = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getMark() > mark) {
                resultList.add(current);
            }
        }
        return resultList;
    }

    // получить список групп в массиве
    public static String[] getListOfGroups(List<Student> students) {
        String[] ListOfGroups = new String[students.size()];

        for (int i = 0; i < students.size(); i++) {
            ListOfGroups[i] = students.get(i).getGroup();
        }
        return ListOfGroups;
    }

    //получить список уникальных групп
    public static List<String> collectUniqueGroups(String[] ListOfGroups) {

        List<String> uniqueGroups = new ArrayList<>();
        int uniqueGroupCounter = 1;
        uniqueGroups.add(0, ListOfGroups[0]);

        for (int j = 1; j < ListOfGroups.length; j++) {
            boolean unique = true;
            for (int i = 0; i < uniqueGroupCounter; i++) {
                if (ListOfGroups[j] == uniqueGroups.get(i)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                uniqueGroups.add(uniqueGroupCounter, ListOfGroups[j]);
                uniqueGroupCounter++;
            }
        }

        return uniqueGroups;
    }

    //получить список групп с минимальным количеством студентов
    public static List<String> getGroupWithMinStudents(List<Student> students, List<String> uniqueGroups) {
        int[] arr = new int[uniqueGroups.size()];

        for (int i = 0; i < uniqueGroups.size(); i++) {
            for (int j = 0; j < students.size(); j++) {
                if (students.get(j).getGroup() == uniqueGroups.get(i)) {
                    arr[i]++;
                }
            }

        }
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        int groupWithMin = sortedArr[0];
        //если несколько групп с минимальным количеством
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == groupWithMin) {
                indexes.add(i);
            }
        }
        List<String> groupsWithMin = new ArrayList<>();
        for (int i = 0; i < indexes.size(); i++) {
            int id = indexes.get(i);
            groupsWithMin.add(uniqueGroups.get(id));
        }

        return groupsWithMin;
    }

}
