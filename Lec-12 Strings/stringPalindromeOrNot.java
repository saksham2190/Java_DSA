//Brute force solution

public class stringPalindromeOrNot{
    static boolean palin(String str){
        String original = str;
        String rev = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        for(int i=0; i<original.length(); i++){
            char ch1 = original.charAt(i);
            char ch2 = rev.charAt(i);
            if(ch1 != ch2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "noof";
        System.out.println(palin(str));
    }
}