package arrays;

public class ReverseAnArrayInPlace {

    private ReverseAnArrayInPlace() {}

    // Given an array of integers, reverse the array in-place without using any additional array or collection.
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
