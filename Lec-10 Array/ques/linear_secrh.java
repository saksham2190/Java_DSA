public class linear_secrh{
    public static int search(int nums, int [] arr){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == nums){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,4,6,7};
        int nums = 5;
        int res = search(nums, arr);
        System.out.println(res);
    }
}
