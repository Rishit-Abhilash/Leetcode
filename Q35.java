//Search Insert Position

public class Q35 {
    static int binarySearch(int[] nums, int k) {
        int h = nums.length - 1;
        int l = 0;
        int stored = 0;
        if (nums[h] < k){
            return h+1;
        }
        if (nums[l] > k){
            return 0;
        }

        while (l <= h) {
            int m = (l + h) / 2;
            stored = m;
            if (h-l <= 2 && l == 0){
                return m+1;
            }
            if (h-l <= 2 ){
                return m+1;
            }
            
            if (nums[m] == k) {
                stored = m;
                return m;
            }

            if (nums[m] < k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return stored;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int k = 6;
        int ans = binarySearch(nums, k);
        System.out.println(ans);
    }
}
