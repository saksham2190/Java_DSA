public class maxSubarraySum{
    static int maxSubarray(int [] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0; 

        for(int i=0; i<nums.length; i++){

            if(sum ==0){
                start = i;
            }
            sum += nums[i];

            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums [] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubarray(nums));
    }
}