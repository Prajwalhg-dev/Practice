public class Main {
    public static void main(String[] args) {
        String a = "aba";
        String method = new String();

        int left = 0;
        int right = args.length-1;

        while (left < right) {
            String temp = args[left];
            args[left] = args[right];
            args[right] = temp;
            left++;
            right--;
            return;
        }
        System.out.println(a + " ");
        System.out.println(a.substring(0, 2));

   }
}
