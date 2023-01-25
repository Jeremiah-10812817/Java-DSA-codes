public class min2dseatch {
    public static void main(String[] args) {
        int[][] arr = {
                {32,45,65,76},
                {44,6,17,53},
                {33,35,36,37}
        };
        System.out.println(mini(arr));

    }

    static int mini(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < max){
                    return max = arr[row][col];

                }

            }

        }return -1;
    }
}
