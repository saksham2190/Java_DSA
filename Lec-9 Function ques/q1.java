// print enter 3 number from the user and make a func to print their avg.

import java.util.*;

public class q1 {

    
    public static double calcAverage(int a, int b, int c) {
        int sum = a + b + c; 
        double avg = (double)sum / 3; 
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        // Calling function and printing average
        double avg = calcAverage(a, b, c);
        System.out.println("Average = " + avg);
        sc.close();
    }
}
