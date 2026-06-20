// w.a.p to print the sum of all odd no, form 1 to n.

import java.util.Scanner;

public class q2 {
    public static int calcSum(int n) {
        int sum = 0;
        for(int i =1; i<=n; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        
        int sum = calcSum(n);
        System.out.println(sum);
        sc.close();
    }
}
