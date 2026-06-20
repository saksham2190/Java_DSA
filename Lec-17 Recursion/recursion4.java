// print x^n (stack height = n)

public class recursion4 {
    public static int calcpow(int x, int n) {
        
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        int pownm1 = calcpow(x, n-1);
        int pow = x * pownm1;
        return pow;
    }

    public static void main (String[] args){
        int n = 2;
        int x = 3;

        int ans = calcpow(x, n);
        System.out.println(ans);
    }
}



