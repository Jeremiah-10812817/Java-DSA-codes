import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
        int[][] arr = {
                {32,45,65,76},
                {44,6,17,53},
                {33,35,36,37}
        };
        System.out.println(Arrays.toString(twodsearch(arr,4545)));

    }

    static int[] twodsearch(int[][] arr, int target){

        for(int row = 0; row< arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {

                if(target==arr[row][col]){
                   return  new int[]{row, col};


                }

            }
        }return new int[] {-1,-1} ;
    }
}
