import java.util.Arrays;

public class firstandlast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,5)));
    }
    static int[] searchRange(int[] nums, int target){
        int [] finalAns ={-1,-1};
        int first = firsetOrLast(nums,target,true);
        int last = firsetOrLast(nums,target,false);
        finalAns[0]=first;
        finalAns[1]=last;
        return finalAns;



}
static int firsetOrLast(int[] arr, int target, boolean found){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target> arr[mid]){
                start = mid+1;
            } else if (target< arr[mid]) {
                end = mid-1;
            }else{
                ans =mid;
                if(found){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }return ans;
}
}
