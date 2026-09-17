public class Strings {
    public static void main (String[] args){
//         StringBuilder sb = new StringBuilder("tony");
//         System.out.println(sb);

//         // char at index 0
//         System.out.println(sb.charAt(0));

//         //set char at index 0
//         sb.setCharAt(0, 'p');
//         System.out.println(sb);

//         // insert n at index 0
//         sb.insert(2, 'n');
//         System.out.println(sb);

//         // delete n 
//         sb.delete(2, 3);
//         System.out.println(sb);



//         StringBuilder tb = new StringBuilder("h");
//         tb.append("e");
//         tb.append("l");
//         tb.append("l");
//         tb.append("o");
//         System.out.println(tb);
//     }
// }
        StringBuilder s = new StringBuilder("tony");

        s.charAt(0);
        System.out.println(s);

        s.setCharAt(0, 'p');
        System.out.println(s);

        s.insert(2, 'r');
        System.out.println(s);

        s.deleteCharAt(0);
        System.out.println(s);


        StringBuilder sb = new StringBuilder("t");
        sb.append("t");
        sb.append("f");
        System.out.println(sb);
        
    }
        }
