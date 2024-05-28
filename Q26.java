import java.util.*;

public class Q26 {
    static int removeDuplicates(int[] nums) {
        int i =0;
        // int Count = 0;

        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] nums = new int[s];
        for (int i = 0; i < s; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);
        System.out.println(k);
    }
}