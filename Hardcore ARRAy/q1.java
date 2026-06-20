// print the largest no. using array

public class q1 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 0, 99};

        int largest = arr[0]; 

        for(int i =0; i <arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);
    }
}
