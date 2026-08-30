import arrays.MaxAndMinArray;
import arrays.MissingNumber;
import arrays.MoveZeros;
import arrays.RemoveDuplicates;
import arrays.ReverseAnArrayInPlace;
import arrays.SecondLargestElement;
import arrays.hashmaps.TwoSum;
import arrays.searching.BinarySearching;
import hashMap.Anagrams;
import hashMap.CountFrequency;
import hashMap.Intersection;
import hashMap.NonRecurring;
import linkedList.MiddleNode;
import linkedList.MergeSortedList;
import linkedList.RevertLinkedList;
import linkedList.DetectCycle;
import queue.GenerateBinaryNumbers;
import linkedList.SinglyLinkedList;
import queue.ImplementCircularQueue;
import queue.ImplementQueue;
import sorting.BubbleSorting;
import stack.BalancedParenthses;
import stack.NextGreaterElement;
import stack.ReverseString;
import stack.StackImplementation;
import string.Palindrome;
import tree.BinaryTree;
import tree.BinaryTreeHeight;
import tree.LevelOrderTraversal;

void main() {
    IO.println("Hello and welcome!");

    int[] arr1 = { 12, 3, 45, 6, 0, 78, 9, 9 };
    String str1 = "SWISS";
    String str2 = "SSWIS";
    String[] searchArray = { "Apple", "Banana", "Mango", "Orange", "Pineapple" };
    int[] arr2 = { 9, 9, 78, 0, 6, 45, 3, 12 };
    char[] arr3 = { 'a', 'b', 'c', 'd', 'e' };
    int n = 6;
    LinkedList<Integer> list1 = new LinkedList<>();
    list1.add(1);
    list1.add(3);
    list1.add(5);
    list1.add(7);
    LinkedList<Integer> list2 = new LinkedList<>();
    list2.add(2);
    list2.add(4);
    list2.add(6);
    list2.add(8);

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

    ReverseString.reverseString(arr3);

    NextGreaterElement.findNextGreaterElement(arr1);

    ImplementQueue.implementQueue();

    ImplementCircularQueue.implementCircularQueue();

    GenerateBinaryNumbers.generateBinaryNumbers(n);

    SinglyLinkedList.implementSinglyLinkedList(arr1);

    RevertLinkedList.revertLinkedList();

    DetectCycle.detectCycle();

    MiddleNode.findMiddleNode();

    MergeSortedList.mergeSortedList(list1, list2);

    BinaryTree.buildBinaryTree();

    BinaryTreeHeight.findBinaryTreeHeight();

    LevelOrderTraversal.levelOrderTraversal();
}
