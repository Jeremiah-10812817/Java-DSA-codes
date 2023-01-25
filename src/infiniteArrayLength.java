public class infiniteArrayLength {
    public static void main(String[] args) {
        int[] arr ={3,4,6,24,25,39,57,67,867};
        System.out.println(infiniteSearch(arr,25));
    }
    static int infiniteSearch(int[] arr, int target){
        int start =0;
        int end =1;
        while(target>arr[end]){
            int newstart= end+1;
            end = end +(end-start + 1)*2;
            start = newstart;

        }return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[]arr, int target, int start, int end){
        while(start<= end){
            int mid = start+(end - start)/2;
            if(target== arr[mid]){
                return mid;
                }
            if (target> arr[mid]){
                start = mid +1;
            }
            if(target< arr[mid]){
                end = mid - 1;
            }
        }return -1;
    }
}
