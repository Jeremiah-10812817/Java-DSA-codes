// a simple code that outputs the number of times a digit appears in a number
//we take 44042234 and search for the number of times 4 appears
public class countNums {
    public static void main(String[] args) {
       int num = 44042234;
       int count = 0;
       while(num > 0){
           int a = num % 10;
           if(a == 4){
               count++;
           }
           num = num/10;
       }
        System.out.println(count);
    }
}
