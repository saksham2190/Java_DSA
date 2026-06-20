// w.a.p to enter the number till the user wants and at the end it should display the count of positive, negative, zeros entered

import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int poisCount=0, negaCount=0, zeroCount=0;
        char choice;

        do{
            System.out.println("Enter number:");
            int num = sc.nextInt();
            if (num > 0) {
                poisCount++;
            }
            else if(num<0){
                negaCount++;
            }
            else{
                zeroCount++;
            }
            System.out.println("Do you want to enter another number: y/n");
            choice = sc.next().charAt(0);
        } while(choice == 'y' || choice == 'Y');


        System.out.println("count of positive is: " + poisCount);
        System.out.println("count of negative is: " + negaCount);
        System.out.println("count of zero is: " + zeroCount);
        sc.close();
    }
}
                                 