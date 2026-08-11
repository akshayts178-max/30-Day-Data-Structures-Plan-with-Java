import arrays.*;
import arrays.hashmaps.TwoSum;
import arrays.searching.BinarySearching;
import hashMap.Anagrams;
import hashMap.CountFrequency;
import hashMap.Intersection;
import hashMap.NonRecurring;
import sorting.BubbleSorting;
import stack.BalancedParenthses;
import stack.StackImplementation;
import string.Palindrome;

void main() {
    IO.println("Hello and welcome!");

    int[] arr1 = { 12, 3, 45, 6, 0, 78, 9, 9 };
    String str1 = "SWISS";
    String str2 = "SSWIS";
    String[] searchArray = { "Apple", "Banana", "Mango", "Orange", "Pineapple" };
    int[] arr2 = { 9, 9, 78, 0, 6, 45, 3, 12 };

    MaxAndMinArray.findMaxAndMin(arr1);

    ReverseAnArrayInPlace.reverse(arr1);
    IO.println("Reversed: " + Arrays.toString(arr1));

    Palindrome.checkPalindrome("MALAYALAM");

    SecondLargestElement.findSecondLargestElement(arr1);

    MoveZeros.moveZeros(arr1);

    TwoSum.findTwoSum(arr1, 15);

    RemoveDuplicates.removeDuplicates(arr1);

    CountFrequency.countFrequency(arr1);

    NonRecurring.findNonRecurring(str1);

    Anagrams.checkAnagrams(str1, str2);

    BinarySearching.binarySearch(searchArray, "Mango");

    MissingNumber.findMissingNumber(arr1);

    BubbleSorting.bubbleSort(arr1);

    Intersection.findIntersection(arr1, arr2);

    StackImplementation.implementStack();

    BalancedParenthses.checkBalancedParentheses(str1);
}
