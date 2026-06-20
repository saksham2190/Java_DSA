// print x^n (stack height = log n)

public class recursion5 {
    public static int calcpow(int x , int n){

        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        // for even
        if(n%2 == 0){
            return calcpow(x, n/2) * calcpow(x, n/2);
        }
        // for odd
        else{
            return calcpow(x, n/2) * calcpow(x, n/2) * x;
        }

    }
    public static void main(String[] args){
        int x = 0, n = 0;
        int ans = calcpow(x, n);
        System.out.println(ans);
    }

}



