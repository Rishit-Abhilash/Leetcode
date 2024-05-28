public class Q1608 {
    static int specialArray(int[] nums){
        int counter = -1;
        for (int i = 0;i < nums.length;i++){
            if (i <= nums[i])
                counter++;
            if (i == counter)
                break;
        }

        return counter;
    }
    public static void main(String[] args) {
        int [] nums = {0,0};
        System.out.println(specialArray(nums));
    }
}
