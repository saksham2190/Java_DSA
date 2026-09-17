

public class countLenOfStringWithoutLength{

    static int len(String str){
        
        char ch[] = str.toCharArray();
        int len = ch.length;
        
        return len;
    }
    public static void main(String[] args) {
        String str = "oitu";
        System.out.println(len(str));
    }
}