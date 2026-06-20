// left rotate the array and place first element to last

public class q5 {
    public static int[] rot(int []arr){
        int temp = arr[0];

        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

    public static void main (String[] args){
        int [] arr = {1, 4, 4, 6, 7};

        arr = rot(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}


