public class linear_secrh{
    public static int search(int nums, int [] arr){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == nums){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,4,6,7};
        int res = search(4, arr);
        System.out.println(res);
    }
}