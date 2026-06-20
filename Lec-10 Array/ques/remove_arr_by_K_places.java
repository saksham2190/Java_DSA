// 1,2,3,4,5,6,7

public class remove_arr_by_K_places{
    public static void rotateLeft(int[] arr, int n, int d) {
        d = d%n;
        int temp[]= new int [d];
        
        //collecting elements from 0 to d in temp
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }

        //shifting elements from d to n left side
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }

        // placing temp elements after shifting
        for(int i = n-d; i<n; i++){
            arr[i] = temp[i-(n-d)]; // i = n-d+1, n-d+2-(n-d)
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateLeft(arr, arr.length, 16);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}




