public class check__sort_array{
    public static void isSorted(int [] arr){

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                ascending = false;
            }
            else if(arr[i] > arr[i-1]){
                descending = false;
            }
        }
        if(ascending){
            System.out.println("Ascending");
        }
        else if(descending){
            System.out.println("descending");
        }
        else{
            System.out.println("Unsort");
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,3,6,1};
        isSorted(arr);
    }
}