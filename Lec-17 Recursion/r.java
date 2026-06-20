public class r {
    // public static void func(int n){
    //     if(n==0){
    //         return ;
    //     }
        
    //     func(n-1);
    //     System.out.print(n);
    // }
    public static void funcrev(int m){
        if(m==0){
            return ;
        }
        
        System.out.print(m);
        funcrev(m-1);
    }  
    
    public static void main (String[] args){
        // int n = 6;
        int m = 6;
        // func(n);
        funcrev(m);
    }
}
