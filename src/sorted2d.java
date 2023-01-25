import java.util.Arrays;

public class sorted2d {
    public static void main(String[] args) {
        int[][] arr ={
                {5,6,7,8,9},
                {10,11,12,13},
                {14,15,16,17},
                {18,19,20,21}
        };
        System.out.println(Arrays.toString(mainSearch(arr,9)));;

    }

    static int[] mainSearch(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;
        if(row==1){
            return binSearch(arr,0,0,col-1,target);
        }
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col/2;
        while(rStart < (rEnd-1) ){
             int rMid = rStart + (rEnd-rStart)/2;
             if( target == arr[rMid][cMid]){
                 return new int[]{rMid,cMid};
             }
             if (target< arr[rMid][cMid]){
                 rEnd = rMid;
             }else{
                 rStart = rMid;
             }
         }

        if (target == arr[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        if (target == arr[rStart+1][cMid]){
            return new int[]{rStart+1,cMid};
        }
        if (target <= arr[rStart][cMid-1]){
            return binSearch(arr,rStart,0,cMid-1,target);
        }
        if (target <= arr[rStart+1][cMid-1]){
            return binSearch(arr,rStart+1 ,0,cMid-1,target);
        }
        if (target >= arr[rStart][cMid+1] && target <= arr[rStart][col-1]){
            return binSearch(arr,rStart,cMid+1, col-  1,target);
        }else{
            return binSearch(arr,rStart+1,cMid+1,col-1,target);
        }

    }

    static int[] binSearch(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd- cStart)/2;
            if(target == arr[row][mid]){
                return new int[]{row,mid};
            }
            if(target<arr[row][mid]){
                cEnd = mid-1;
            }else
            {
                cStart = mid+1;
            }
        }return new int[]{-1,-1};
    }
}
