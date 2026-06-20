//w.a.p in func that takes in the age as input abd return if that person is eligible to vote or not. a person of age > 18 is eligible to vote
import java.util.*;

public class q5 {
    public static void vote(int n){
        if (n>=18){
            System.out.println("Go vote BJP");
        }
        else{
            System.out.println("Go vote CONGRESS");
        }
        
        
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mf age: ");
        int n = sc.nextInt();
        vote(n);
        sc.close();
    }
}
