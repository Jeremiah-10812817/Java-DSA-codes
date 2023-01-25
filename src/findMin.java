public class findMin {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,2,7,5,4,2,87};
        System.out.println(mini(arr));
    }
    static int mini(int[] arr){
        int comp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(comp > arr[i]){
                comp = arr[i];
            }
        }return comp;
    }
}
