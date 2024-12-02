import java.util.Arrays;
//HARD QUESTION
//https://leetcode.com/problems/first-missing-positive/description/
//https://chatgpt.com/share/674ade1b-2b38-8002-ba92-a9140efc574f

//MUST COME BACK TO THIS
public class LeetCode41 {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(missingNumber(arr)); // Expected Output: 3
    }

    static int missingNumber(int[] arr) {
        int i = 0;

        // Cyclic sort to place numbers in their correct positions
        while (i < arr.length) {
            int correct = arr[i] - 1; // Correct index for the value arr[i]
            if (correct >= 0 && correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct); // Place the number in the correct position
            } else {
                i++; // Move to the next index if no swap needed
            }
        }

        // Find the first index where the value is incorrect
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1; // Return the missing positive number
            }
        }

        // If all numbers are correctly placed, return the next positive integer
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
