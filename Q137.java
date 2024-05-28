public class Q137 {
    

    static int singleNumberII(int [] nums){
        int [] freq = new int[100000];
        int ans = 0;
        for (int i = 0;i < nums.length;i++){
            int n = nums[i];
            freq[n]++;
        }
        for (int i = 0;i <100000;i++){
            if (freq[i] == 1)
                ans = i;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {0,1,0,1,0,1,99};
        System.out.println(singleNumberII(nums));
    }
}
