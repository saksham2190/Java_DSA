// remove the duplicate element from sorted array


public class q4 {
    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0; 
        for (int j = 1; j < arr.length; j++) { 
            if (arr[i] != arr[j]) { 
                i++;
                arr[i] = arr[j]; 
                
            }
        }
        return i + 1; 
    }

    public static void main (String[] args){
        int [] arr = {1, 3, 3, 3, 6, 6, 9, 9};
        int newLength = removeDuplicate(arr);

        System.out.println("new length" + newLength);

        for (int i = 0; i < newLength; i++) { 
            System.out.print(arr[i] + " ");
        }
    }
}


