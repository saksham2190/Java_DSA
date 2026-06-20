public class compare {
    public static void main (String[] args){

        //compare
        String a = "Tony";
        String b = "Tony";

        // 1) s1 > s2 : +ve value
        // 2) s1 == s2 : 0
        // 3) s1 < s2 : -ve value

        if(a.compareTo(b)==0){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Strings are unequal        nn             ");
        }

    }
}
