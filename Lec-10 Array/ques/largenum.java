public class largenum{
    public static void main(String[] args){
        int  arr[] =  {1, 4, 5, 76, 55, 8};

        int largest = arr[0];

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            
        }
        System.out.println(largest);
    }
}