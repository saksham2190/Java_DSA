public class subString {
    public static void main (String[] args){


        String sentence = "Tony Stark";
        String name = sentence.substring(5, sentence.length());
        //or
        String a = sentence.substring(5);
        System.out.println(name);
        System.out.println(a);

        //String is immutable cannot be change 
    }
}
