import arrays.MaxAndMinArray;
import arrays.MoveZeros;
import arrays.RemoveDuplicates;
import arrays.ReverseAnArrayInPlace;
import arrays.SecondLargestElement;
import arrays.hashmaps.TwoSum;
import hashMap.CountFrequency;
import hashMap.NonRecurring;
import string.Palindrome;

void main() {
    IO.println("Hello and welcome!");

    int[] arr = { 12, 3, 45, 6, 0, 78, 9, 9 };
    String str = "SWISS";

    MaxAndMinArray.findMaxAndMin(arr);

    ReverseAnArrayInPlace.reverse(arr);
    IO.println("Reversed: " + Arrays.toString(arr));

    Palindrome.checkPalindrome("MALAYALAM");

    SecondLargestElement.findSecondLargestElement(arr);

    MoveZeros.moveZeros(arr);

    TwoSum.findTwoSum(arr, 15);

    RemoveDuplicates.removeDuplicates(arr);

    CountFrequency.countFrequency(arr);

    NonRecurring.findNonRecurring(str);
}
