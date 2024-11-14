public class LeetCode55 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,5,2,1,0,0,1,3};
        System.out.println(canJump(nums));
    }

    static boolean canJump(int[] nums){
        int finalIndex = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if(i + nums[i] >= finalIndex)
                finalIndex = i;
        }

        return finalIndex == 0;
    }

}
