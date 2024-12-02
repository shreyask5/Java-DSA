import java.util.Arrays;

public class CyclicSort2 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] - 1 != i){
                swap(arr,i,arr[i]-1);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
