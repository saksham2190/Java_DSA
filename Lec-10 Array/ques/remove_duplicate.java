
// remove thr duplicate from sorted array
// 1, 1, 2, 2, 3, 4,
public class remove_duplicate{
    public static int enterArr(int [] arr){
        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3,3,3,3,3,4,4};
        int res = enterArr(arr);
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
}