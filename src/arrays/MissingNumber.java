package arrays;

public class MissingNumber {
    private MissingNumber() {}

    // Find the missing number in a range 1..n
    public static void findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missingSum = expectedSum - actualSum;
        System.out.println("Missing number: " + missingSum);
    }
}
