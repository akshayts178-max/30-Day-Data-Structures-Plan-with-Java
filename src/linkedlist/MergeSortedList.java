package linkedlist;

import java.util.LinkedList;

public class MergeSortedList {
    private static final String MERGED_LIST_PREFIX = "Merged list: ";

    private MergeSortedList() {}

    // Merge two sorted linked lists
    public static void mergeSortedList(LinkedList<Integer> list1, LinkedList<Integer> list2){
        if(list1 == null && list2 == null){
            System.out.println("Both lists are null");
            return;
        }

        if (list1 == null) {
            System.out.println(MERGED_LIST_PREFIX + list2);
            return;
        }

        if (list2 == null) {
            System.out.println(MERGED_LIST_PREFIX + list1);
            return;
        }

        LinkedList<Integer> mergedList = getIntegers(list1, list2);

        System.out.println(MERGED_LIST_PREFIX + mergedList);
    }

    private static LinkedList<Integer> getIntegers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }
        return mergedList;
    }
}
