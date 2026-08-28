import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String method = new String();
        String a = "Hello Java";
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(0,5));

        String b = "Hello World";
        System.out.println(a.equals(b));
        System.out.println(a.indexOf("J"));
    }
}
