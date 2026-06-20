// w.a.p to that takes in the radius as input and returns the circumference of circle

import java.util.Scanner;

public class q4 {
    public static double radii(int r){
        
        double circle = 3.14 * r * r;
        return circle; 
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Radius: ");
        int r =sc.nextInt();

        double circle = radii(r);
        System.out.println(circle);
        sc.close();
    }

}