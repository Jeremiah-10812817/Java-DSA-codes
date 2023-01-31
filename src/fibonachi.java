import java.util.Scanner;

// A simple code to know the value of the nth term of the series
public class fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println(b);


    }
}
