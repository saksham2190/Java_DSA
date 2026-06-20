import java.util.*;

public class q7 {

    // Brute solution
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 7, 0, 0, 0, 4, 6, 7};

        ArrayList<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                tempList.add(arr[i]);
            }
        }

        System.out.println("Non-zero elements in ArrayList: " + tempList);

        int[] temp = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }

        System.out.print("Non-zero elements in array: ");
        for (int num : temp) {
            System.out.print(num + " ");
        }
    }
}

