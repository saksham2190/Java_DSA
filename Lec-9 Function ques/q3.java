//w.a.p whic takes 2 no. and returns the greater of those two

import java.util.Scanner;

public class q3 {
    public static int greaterVal(int a, int b){
        if(a<b){
            
            return b;
        }
        else{
           
            return a;
        }
        
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a:");
        int a = sc.nextInt();
        
        System.out.println("enter b:");
        int b = sc.nextInt();
        

        int res = greaterVal(a, b);
        System.out.println(res + " is greater");
        sc.close();

    }


}
