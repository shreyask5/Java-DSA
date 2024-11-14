public class LeetCode58 {
    public static void main(String[] args) {
        lengthOfLastWord("Hello World");
    }

    static int lengthOfLastWord(String s) {
        String[] arr =  s.trim().split(" ");
        return arr[arr.length - 1].length();
    }
}
