import java.util.Arrays;

public class bubbkeSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,2,53,533,45,3,77};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped= true;
                }

            }if(!isSwapped){
                break;
            }

        }
    }

}
