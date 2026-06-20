public class r5 {



    private static int helper (int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num%2 == 0){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
    public static int helper(int num){
        return helper(num, 0);
    }
    
    public static void main (String[] args){
        System.out.println(helper(16788));
    }
}
