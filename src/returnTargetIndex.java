//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.

public class returnTargetIndex {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,6,45,67,68,78,79,80};
        System.out.println(bSearch(arr,67));



    }
    static int bSearch(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid-1;
            }
            if (arr[mid] < target) {
                start = mid+1;

            }
        }return -1;
    }
}
