public class LeetCode45 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println(jump(arr));
    }

    static int jump(int[] arr) {
        int destination = arr.length - 1;
        int totalJumps = 0, coverage = 0, lastJumpIdx = 0;

        if (arr.length == 1)
            return totalJumps;

        for (int i = 0; i < arr.length - 1; i++) { // Loop until second-last index
            coverage = Math.max(coverage, i + arr[i]);

            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;
            }

            if (lastJumpIdx >= destination) // Check if we've reached the destination
                return totalJumps;
        }

        return totalJumps;
    }
}
