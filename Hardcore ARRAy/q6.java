// left rotate the array and send first 3 elements to last


public class q6 {
    public static void main (String[] args){

        // Brute Solution......

        // int D = 3;
        // int[] arr = {1,2,3,4,5,6,7};

        // int [] temp = {1 ,2 , 3};
        // for(int i = D; i < arr.length; i++){
        //     arr[i-D] = arr[i];
        // }

        // for(int i = arr.length-D; i < arr.length; i++){
        //     arr[i] = temp[i - (arr.length - D)];
        // }

        // for(int num : arr) {
        //     System.out.print(num + " ");
        
        // } 



        // Optimal solution
        int D = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        // Step 1: Reverse first D elements
        reverse(arr, 0, D - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, D, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
    }

    public static void reverse(int[]arr, int start, int end) {
        while (start < end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

    
        
    



