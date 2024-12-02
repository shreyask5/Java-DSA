//https://leetcode.com/problems/find-the-duplicate-number/description/
public class LeetCode287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] == arr[correct] && arr[i] - 1 != i){
                return arr[i];
            } else if(arr[i] != arr[correct]){
                swap(arr,i,arr[i]-1);
            }else {
                i++;
            }
        }
        return 0;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
