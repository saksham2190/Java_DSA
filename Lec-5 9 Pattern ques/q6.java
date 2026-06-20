
//          *
//         **
//        ***
//       ****


// public class q6 {
//     public static void main (String [] agrs){
//         int n = 4;

//         for (int i = 1; i <= n; i++){
//             // for space
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             //for star
//             for (int j =1; j<=i; j++ ){
//                 System.out.print("*");
//             }
//         System.out.println();
//         }
//     }    
// }

// public class q6{
//     public static void main(String[] args){
//         int n= 4;
//         for(int i=1; i<=n; i++){
//             //for space
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k<=i; k++){
//                     System.out.print("*");
//             }

//             System.out.println();
//         }
        
//     }
// }

public class q6{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n; i++) {
                //for space
                for(int j=1; j<=n-1; j++){
                    System.out.print(" ");
                }
                // for star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            System.out.println();
        }   
    }
}