import java.util.Scanner;

public class hashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // 2. Read array elements
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //  Precompute frequencies into hash array
        // Assumes elements are within range [0, 12]
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        //  Handle query lookups
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter number to query: ");
            int number = sc.nextInt();

            // Fetch frequency in O(1) time
            if (number >= 0 && number < hash.length) {
                System.out.println("Frequency: " + hash[number]);
            } else {
                System.out.println("Frequency: 0 (Out of range)");
            }
        }

        sc.close();
    }
}