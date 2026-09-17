public class printEachCharOfString{

    static void printString(String str){
        int n = str.length();
        for(int i=0; i<=n; i++){
            char ch = str.charAt(i);
            System.out.print(ch);
        }

    }
    public static void main(String[] args) {
        String str = "abcd";
        printString(str);
    }
}