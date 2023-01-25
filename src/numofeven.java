public class numofeven {
    public static void main(String[] args) {
        //create an
        int[] arr = {0,2,23,4,0,54,2,12};
        System.out.println(count(-23476));
    }
        // count the number of digits in a numer
    static int count(int a){
        int num = 0;
        if (a==0){
            return 1;
        }
        while (a>0){
            a/=10;
            num++;

        }
        while (a<0){
            a/=10;
            num++;

        }
        return num;
        }



    static int iseven(int[]arr) {
        int step = 0;
        for (int i = 0; i < arr.length; i++) {


                if (count(arr[i]) % 2 == 0) {
                    step++;
                }
        }return step;

    }
}
