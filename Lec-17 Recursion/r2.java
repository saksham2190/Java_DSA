public class r2{
    public static void Mc(int n){
        if(n ==1){
            return;
        }
        System.out.println(n);
        Mc(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        Mc(n);    }
}
