// concatenation means making two or more string combine with each other called concatenation



public class Concatenation {

    public static void main (String[] args){
        String firstGali = "MC";
        String secndGali = "BC";
        String thirdgali = "TC";
        String Gali = firstGali + " " + secndGali + " " + thirdgali;
        
        System.out.println(Gali);
        System.out.println(Gali.length()); //.length will print length of character

        //charAt
        for(int i = 0; i<=Gali.length(); i++){
            System.out.println(Gali.charAt(i));
        }
    }
}
