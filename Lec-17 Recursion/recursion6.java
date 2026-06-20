// Tower of Hanoi
// only one disk can be transferred in one stap
// smaller disk will always be placed on the larger disk

public class recursion6 {
    public static void TowerOfHanoi(int n, String src, String helper, String dest){

        if(n == 1){
            System.out.println("Disk transfer to" + n + "from" + src + "to" + dest);
            return;
        }

        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("Disk transfer to" + n + "from" + src + "to" + dest);
        TowerOfHanoi(n-1, helper, src, dest);
        
    }

    public static void main(String[] args){
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D"); // S = Source, H = Helper, D = Destination
        System.out.println("✅ All disks moved to Destination (D)");
    }
}


