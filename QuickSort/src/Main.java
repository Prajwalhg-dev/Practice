public class Main {
    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high], i = low;
            for (int j = low; j < high; j++ ) {
                if (arr[j] < pivot) {
                    int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
                    i++;
                }
            }
            int tmp = arr[i]; arr[i] = arr[high]; arr[high] = tmp;
            quicksort(arr, low, i - 1);
            quicksort(arr, i +1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quicksort(arr, 0, arr.length - 1);
        for (int n : arr)
            System.out.print(n + " ");
    }
}

