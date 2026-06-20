// 1,2,3,5,6

public class place_first_ele_2_last{
    public static void main(String[] args) {

        int n [] = {1,2,3,5,6};
        int temp = n[0];


        for(int i=1; i<n.length; i++){
            n[i-1] = n[i];
        }
        n[n.length-1] = temp;

        for(int i = 0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
}