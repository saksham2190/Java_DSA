// import java.util.*;


// public class twod {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int [][] number = new int [row][col];

//         //input
//         for(int i = 0; i<row; i++){
//             for(int j = 0; j<col; j++ ){
//                 number[i][j] = sc.nextInt();
//             }
//         }
        
//         System.out.println("this is a matrix:   ");

//         //output
//         for(int i = 0; i< row; i++){
//             for(int j=0; j<col; j++){
//                 System.out.print(number[i][j] + " ");
//             }
//             System.out.println();
//         }
        

//     }
// }


import java.util.*;

public class twod{
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colmns = sc.nextInt();
        int numb [][] = new int[rows][colmns];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<colmns; j++){
                numb[i][j] = sc.nextInt();
            }
        }

        System.out.println("This is the matrix: ");

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<colmns; j++){
                System.out.print(numb[i][j] + " ");
            }
            System.out.println();
        }
    }
}