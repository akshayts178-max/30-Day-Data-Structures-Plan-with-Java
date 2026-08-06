package string;

public class Palindrome {
    //Check if a string is a palindrome

    public static void checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a palindrome");
            }
            left++;
            right--;
        }

        System.out.println("Palindrome: " + str);
    }
}
