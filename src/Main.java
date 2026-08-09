import arrays.MaxAndMinArray;
import arrays.MoveZeros;
import arrays.ReverseAnArrayInPlace;
import arrays.SecondLargestElement;
import arrays.hashmaps.TwoSum;
import string.Palindrome;

void main() {
    IO.println("Hello and welcome!");

    int[] arr = { 12, 3, 45, 6, 0, 78, 9 };

    MaxAndMinArray.findMaxAndMin(arr);

    ReverseAnArrayInPlace.reverse(arr);
    IO.println("Reversed: " + Arrays.toString(arr));

    Palindrome.checkPalindrome("MALAYALAM");

    SecondLargestElement.findSecondLargestElement(arr);

    MoveZeros.moveZeros(arr);

    TwoSum.findTwoSum(arr, 15);
}
