

// public class marks {
//     public static void main (String[] args){
//         int [] marks = new int[3];
//         marks[0] = 23;
//         marks[1] = 19;
//         marks[2] = 2;
        
        
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
        
//         //Print like this or 

//         for(int i = 0; i<3; i++){
//             System.out.println(marks[i]);
//         }

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int  numb[] = new int[3];
//         for(int i = 0; i< num; i++){
//             System.out.println(numb[i]);
//         }
//     }
// }
import java.util.*;

public class marks{
    public static void main(String[] args){
        int marks [] = new int[3];
        marks [0] = 65;
        marks [1] = 45;
        marks [2] = 85;
        // System.out.println("English: " + marks[0]);
        // System.out.println("Math: " + marks[1]);
        // System.out.println("Sst: "+ marks[2]);
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int mark[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            mark[i] = sc.nextInt();
        }

        //output
        for(int i = 0; i<size; i++){
            System.out.println("marks are: " + mark[i]);
        }


    }
}