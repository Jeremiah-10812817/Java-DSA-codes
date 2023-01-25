import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]= {4,2,5,6,3,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length- 1- i;
            int maxindex = greatestindex(arr, 0,end);
            swap(arr, maxindex,end);
        }

    }

    static int greatestindex(int [] arr,int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
