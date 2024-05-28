import java.util.Scanner;

public class Q136 {
    static int Checking(int [] nums, int s){
        int key = 0;
        int ans = 0;
        String S = "yes";
        boolean notkey = false;
        for (int i = 0;i<s;i++){
            for(int j = i+1;j<s;j++){
                // System.out.println("j = " + nums[j]);
                if(nums[i] == nums[j]){
                    notkey = true;
                    S = "yes";
                    break;
                }
                else{
                    notkey = false;
                    key = nums[i];
                }
            }   
            
            if(notkey == false){
                ans = key;
                break;
            }
        
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // size
        int[] nums = new int[s]; // New Array
        for (int i = 0; i < s; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = Checking(nums, s);
        System.out.println(ans);
        sc.close();
    }
}
