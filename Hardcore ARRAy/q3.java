//check if the array is sorted or not

// Acending case
public class q3 {
    public static boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){        // int i = 1; becos If i = 0, then arr[i - 1] becomes arr[-1], which doesn’t exist in Java 
            if(arr[i] < arr[i-1]){      // i-1 for acending case or you can switch sign
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7};

        if(isSorted(arr)){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array not Sorted");
        }
    }
}

