// print 
//      *       *
//      **     **
//      ***   ***
//      *********
//      *********
//      ***   ***
//      **     **
//      *       *


public class q1 {
    public static void main (String[] args){
        int n = 5;
        // upper half
        for (int i = 1; i <= n; i++){
            // 1 part - star       
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //2 part - space
            int space = 2*(n-i);
            for ( int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //3 part - star
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--){
            // 1 part - star       
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //2 part - space
            int space = 2*(n-i);
            for ( int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //3 part - star
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
