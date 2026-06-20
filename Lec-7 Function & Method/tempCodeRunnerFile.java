print factorial of given no.

import java.util.Scanner;

public class q3 {
    public static void printFactr(int n){


        if(n == 0){
            System.out.println("1");
        }

        else{
            int factr = 1;
            for(int i = n; i>=1; i--){
            factr = factr*i;
            }

        System.out.println(factr);
    }
        return;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); // to take input
        int n = sc.nextInt();

        printFactr(n);

    }
}