import java.util.*;
public class unionOfTwoArray{
    public static int unionArr(int [] nums1, int [] nums2){
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++){
            set.add(nums2[j]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int nums1[] ={1, 2, 3, 5, 5, 6, 3};
        int nums2[] ={ 1, 3};
        System.out.println(unionArr(nums1, nums2));
    }
}