public class mountainarray {
    public static void main(String[] args) {
        int[]arr = {5,1,3};
        System.out.println(pivot(arr));
    }

    static int search(int[] nums, int target) {
    int ans = pivot(nums);
    if (target == nums[ans]){
        return ans;}
    else if(binarysearch1(nums,target,0,ans)==-1){
        return binarysearch1(nums,target, ans+1,nums.length-1);
    }return binarysearch1(nums,target,0,ans);


}
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length- 1;

        while(start<=end){

            int mid = start + (end-start)/2;
            if (mid<end && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<= arr[start]){
                end = mid -1;
            }else{start = mid+1;}
        }return -1;
    }
     static int binarysearch1(int[] arr, int target, int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target== arr[mid]){
                return mid;
            } 
            else if (target> arr[mid]){
                start = mid +1;
            }else{end = mid -1;}
        }return -1;
    }
}

