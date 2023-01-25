public class binarySearch {
    public static void main(String[] args) {
    int[] arr = {2,5,7,56,57,58,60};
        System.out.println(bisearch(arr,90));
    }
    static  int bisearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target< arr[mid]){
                end = mid -1;
            }
            if (target > arr[mid]){
                start = mid +1;
            }
        }return -1;
    }
}
