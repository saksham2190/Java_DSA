// print the multipliction of 2 no. using func
import java.util.*;

public class q2 {
    
    public static int calcMulti(int a, int b){
        int sum = a * b;
        return sum;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calcMulti(a, b);
        System.out.println(sum);
    }
}
