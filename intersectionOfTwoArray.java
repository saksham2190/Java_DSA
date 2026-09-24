import java.util.*;
public class intersectionOfTwoArray{
    static int [] intersection(int [] nums1, int [] nums2){
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> resultSet = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int j=0; j<nums2.length; j++){
            if(set.contains(nums2[j])){
                resultSet.add(nums2[j]);
            }
        }

        int [] result = new int [resultSet.size()];
        int count = 0;
        for(int num: resultSet){
            result[count++] = num;
        }
        return result;

    }
    public static void main(String[] args) {
        int nums1 [] = {1, 4, 4, 4, 6, 6 ,6};
        int nums2 [] = {1, 5, 3, 6, 3};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}