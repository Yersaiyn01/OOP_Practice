import java.util.Scanner;

public class task6 {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        if (isPalindrome(text)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        input.close();
    }
}
