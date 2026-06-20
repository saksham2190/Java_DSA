public class Strings {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert n at index 0
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete n 
        sb.delete(2, 3);
        System.out.println(sb);



        StringBuilder tb = new StringBuilder("h");
        tb.append("e");
        tb.append("l");
        tb.append("l");
        tb.append("o");
        System.out.println(tb);
    }
}
