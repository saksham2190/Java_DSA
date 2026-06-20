public class two_large{
    public static void main(String[] args) {
        int arr [] = {1, 33, 4, 78, 34, 3};

        int largest = arr[0];
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] > largest){
               largest = arr[i];
            }
        }
        int secLarge = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] > secLarge && arr[i] != largest){
                secLarge = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secLarge);
    }
}