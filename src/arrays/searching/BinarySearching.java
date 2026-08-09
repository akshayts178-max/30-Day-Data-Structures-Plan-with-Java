package arrays.searching;

public class BinarySearching {
    private BinarySearching() {}

    // Binary search on a sorted array
    public static void binarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int compare = arr[mid].compareTo(target);

            if (compare == 0) {
                System.out.println("Element found: " + target + " at index: " + mid);
                return;
            }

            if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element not found: " + target);
    }
}
