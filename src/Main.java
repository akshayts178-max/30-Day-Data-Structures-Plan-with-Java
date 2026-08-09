import arrays.MaxAndMinArray;
import arrays.MoveZeros;
import arrays.RemoveDuplicates;
import arrays.ReverseAnArrayInPlace;
import arrays.SecondLargestElement;
import arrays.hashmaps.TwoSum;
import arrays.searching.BinarySearching;
import hashMap.Anagrams;
import hashMap.CountFrequency;
import hashMap.NonRecurring;
import string.Palindrome;

void main() {
    IO.println("Hello and welcome!");

    int[] arr = { 12, 3, 45, 6, 0, 78, 9, 9 };
    String str1 = "SWISS";
    String str2 = "SSWIS";
    String[] searchArray = { "Apple", "Banana", "Mango", "Orange", "Pineapple" };

    MaxAndMinArray.findMaxAndMin(arr);

    ReverseAnArrayInPlace.reverse(arr);
    IO.println("Reversed: " + Arrays.toString(arr));

    Palindrome.checkPalindrome("MALAYALAM");

    SecondLargestElement.findSecondLargestElement(arr);

    MoveZeros.moveZeros(arr);

    TwoSum.findTwoSum(arr, 15);

    RemoveDuplicates.removeDuplicates(arr);

    CountFrequency.countFrequency(arr);

    NonRecurring.findNonRecurring(str1);

    Anagrams.checkAnagrams(str1, str2);

    BinarySearching.binarySearch(searchArray, "Mango");
}
