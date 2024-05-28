import java.util.Scanner;

public class Q198 {
    static int rob(int[] nums){
        new [] dp = fill
        
        return 0;

    }

    // static int rob(int[] nums){
    //     int sum1 = 0,sum2 = 0;
    //     for (int i = 0; i < nums.length; i+=2) {
    //         sum1 = sum1 + nums[i];
    //     }
    //     for (int i = 1; i < nums.length; i+=2) {
    //         sum2 = sum2 + nums[i];
    //     }
    //     // System.out.println(sum1 +" "+ sum2);
    //     if (sum1 > sum2){
    //         return sum1;
    //     }
    //     else{
    //         return sum2;
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int [] nums = new int[s];

        for(int i = 0;i < s;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(rob(nums));
    }
}
