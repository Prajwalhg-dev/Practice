public class Main {
    public static void main(String[] args) {
        StringBuilder SB = new StringBuilder("Hello ");
        System.out.println(SB.append("Java"));
        System.out.println(SB.insert(5, " Java Programming"));
        System.out.println(SB.delete(5, 10));
        System.out.println(SB.length());
        
    }

}