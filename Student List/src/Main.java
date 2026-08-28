import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(92);
        marks.add(78);
        marks.add(90);
        marks.add(65);
        marks.add(88);
        marks.add(76);

        System.out.println("Original marks:" + marks);

        int Highest = Collections.max(marks);
        int Lowest = Collections.min(marks);

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.size();

        System.out.println("Highest mark: " + Highest);
        System.out.println("Lowest mark: " + Lowest);
        System.out.println("Average mark: " + average);

        marks.removeIf(mark -> mark < 80);

        System.out.println("After removing marks below 80: " + marks);


        if (marks.contains(90)) {
            System.out.println("90 is still present in the list.");
        } else {
            System.out.println("90 is not present in the list.");
        }
    }
}



