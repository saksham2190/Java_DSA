// print factorial of given no.

import java.util.Scanner;

public class q3 {
    public static void printFactr(int n){


        if(n == 0){
            System.out.println("1");
            return;
        }

        if(n <-50){
            System.out.println("Invalid number");
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

// import java.util.*;

// public class q3{
//     public static void calcFact(int n){
//         if(n==0){
//             System.out.println("1");
//         }
//         else{
//             int fact = 1;
//             for(int i=1; i<=n; i++){
//                 fact = fact*i;
//             }
//         System.out.println(fact);
//         }
//         return;
//     }

//     public static void main(String[] agrs){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

        
//         calcFact(n);
// }
// }