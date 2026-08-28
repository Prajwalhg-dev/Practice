import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = sc.nextLine();
        int character = 0;
        int words = 0;
        int vowels = 0;
        String lower = sentence.toLowerCase();
        System.out.println(lower);
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch != ' ') {
                character++;
            }
            if (ch == 'a' || ch == 'e') {
                vowels++;
                System.out.println("Sentence" + sentence);
                System.out.println("Character" + character);
                System.out.println("Vowels" + vowels);
                sc.close();

            }

        }

    }
}
