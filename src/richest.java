import java.util.Arrays;

public class richest {
    public static void main(String[] args) {
        int[][] arr={
            {2,1,4},
            {3,2,5},
            {3,1,4}
        };
        System.out.println(maxiWealth(arr));
        //System.out.println(Arrays.toString(maxiWealth(arr)));
    }

    static int maxiWealth(int[][]arr){

        int comp= 0;
        for (int row = 0; row < arr.length; row++) {
            int num = 0;
            for (int col = 0; col < arr[row].length; col++) {
                num +=arr[row][col];
            }
            if (num>comp){
                comp = num;
            }


        }return comp ;
    }
}
