//a simple code that reverses the sequence of a number
// example 211 will output 112 and 30297 will output 79203
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        while(num > 0){

            int rem = num % 10;
            ans = ans * 10 + rem ;
            num/=10;
        }
        System.out.println(ans);
    }
}
