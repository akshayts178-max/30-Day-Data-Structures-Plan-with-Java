package arrays;

public class SecondLargestElement {

    private SecondLargestElement() {}

    //Find the second-largest element in an array
    public static void findSecondLargestElement(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must be greater than or equal to 2");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
