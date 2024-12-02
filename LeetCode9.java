//https://leetcode.com/problems/palindrome-number/description/
public class LeetCode9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int x){
        int original = x;
        int reverse = 0;

        while (original > 0){
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return x == reverse;
    }
}
