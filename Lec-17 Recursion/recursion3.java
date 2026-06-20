// print fibonaaci series using recursion

public class recursion3 {
    public static void calcfab(int n, int a, int b){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        calcfab(n-1, b, c);
    }
    public static void main (String[] args){
        int a = 0;
        int b = 1;
        int n = 5;
        System.out.println(a);
        System.out.println(b);
        
        calcfab(n-2, a, b);
    }
}
