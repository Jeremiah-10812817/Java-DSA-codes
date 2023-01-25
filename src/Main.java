public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,6,7,4};
        System.out.println(linSearch(arr,23));

    }

    static  boolean linSearch(int[] arr, int term){

        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int comp =arr[i];
            if (term == comp){
                return true;
            }

        }
        return false;
    }
}