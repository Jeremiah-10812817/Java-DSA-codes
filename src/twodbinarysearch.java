import java.util.Arrays;
// for sorted rows and columns
public class twodbinarysearch {
    public static void main(String[] args) {
    int[][] arr = {
            {1, 2, 4, 5},
            {3, 6, 7, 8},
            {10, 11, 12, 13}
    };
        System.out.println(Arrays.toString(twodsearch(arr,1)));
}

    static int[] twodsearch(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length &&  col>=0) {
            if (target == arr[row][col]) {
                return new int[]{row, col};
            }
            if (target < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
