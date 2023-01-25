public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceil(arr,15));

    }
    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end- start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (target < arr[mid]){
                if(target > arr[mid-1]) {
                    return mid;
                }else{
                end = mid -1;}

            }
            if (target > arr[mid]){

                    start = mid+1;
                }

            }return -1;

        }
    }

