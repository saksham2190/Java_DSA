public class printNam_n_times{
    public static void printNam(String name, int n){
        if(n > 3){
            return;
        }
        System.out.println(name);

        printNam (name, n+1);
    }
    public static void main(String[] args) {
        int n = 0;
        String name = "alice";
        printNam(name, n);
    }
}