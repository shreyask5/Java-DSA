import java.util.Arrays;

public class LeetCode819 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        mostCommonWord(paragraph,banned);
    }

    static String mostCommonWord(String paragraph, String[] banned){
        String[] arr = paragraph.replaceAll("\\p{Punct}","").toLowerCase().split(" ");
        int[] size = new int[arr.length];
        return "yes";
    }
}
