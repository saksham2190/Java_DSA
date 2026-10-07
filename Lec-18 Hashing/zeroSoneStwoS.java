import java.util.*;
public class zeroSoneStwoS{
    static void sortedArray(int arr[]){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
        if(arr[mid] == 0){

            // swap(arr[low], arr[mid]);
            // low++
            // mid++
            
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
        }

        else if(arr[mid] == 1){

            //mid++

            mid++;
        }
        else{

            // swap(arr[high], arr[mid])
            // high--

            int temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = temp;
            high--;
        }
        }
        
    }
    public static void main(String args[]){
        int arr [] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        sortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}