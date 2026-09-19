public class reverseString{
    static String reverseString(String str){
        
        String rev = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "whad";
        System.out.println(reverseString(str));
    }
}