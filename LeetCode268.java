//https://leetcode.com/problems/missing-number/description/
public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(i != arr[i] && arr[i] < arr.length){
                swap(arr,i,arr[i]);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j)
                return j;
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
