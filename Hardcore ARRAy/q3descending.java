// Descending Case

public class q3descending {
    public static boolean isSorted(int [] arr){
        for(int i = 0; i <= arr.length; i++){   // Here we can use both i= 0 or 1 becos it satisfy the arr[i+1] equn.
            if(arr[i] < arr[i+1]){      // Here used i+1 becos we need descending case
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr [] = {1, 3, 6, 9};

        if(isSorted(arr)){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array not Sorted");
        }
    }
}




