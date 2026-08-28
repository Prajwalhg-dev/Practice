import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();


        students.put(101, "Rahul - 85");
        students.put(102, "Priya - 92");
        students.put(103, "Amit - 78");
        System.out.println("Students: " + students);
        students.put(102, "Priya - 95");
        students.remove(103);
        students.put(104, "Sneha - 90");
        students.put(101, "Rahul - 80");
        System.out.println("After Operations:");
        System.out.println(students);
    }
}