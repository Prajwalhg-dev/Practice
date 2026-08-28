public class Main {
    public static void main(String[] args) {
        int[] arr = {50, 10, 20, 30, 40};
        boolean ascending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        if (ascending)
            System.out.println("Array is in ascending order");
        else
            System.out.println("Array is not in ascending order");
    }
}