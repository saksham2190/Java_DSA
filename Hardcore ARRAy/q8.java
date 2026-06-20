import java.util.HashSet;

public class q8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 2};
        int[] arr2 = {2, 5, 6, 7, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        
        for (int num : arr2) {
            set.add(num);
        }

        System.out.print("Union of two arrays: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
