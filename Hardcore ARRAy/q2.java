// print second largest no. using array

public class q2 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 0, 99};

        // int largest = Integer.MIN_VALUE; 
        // int slargest = Integer.MIN_VALUE;

        // for(int i =0; i <arr.length; i++){
        //     if(arr[i] > largest){
        //         largest = arr[i];
        //     }
        // }
        // System.out.println("Largest element: " + largest);


        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] > slargest && arr[i] != largest){
        //         slargest = arr[i];
        //     }
        // }
        // System.out.println("Second largest element:" + slargest);



        // Optimal Solution

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length; i++ ) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
    
}



