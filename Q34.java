public class Q34 {
    static int nextIndex(int [] nums, int k , int m){
        if (m+1 >= nums.length || nums[m+1] != k ){
            return m;
        }
        return nextIndex(nums, k, m+1);
        
    }

    static int prevIndex(int [] nums, int k , int m){
        if (m-1 <= -1 || nums[m-1] != k){
            return m;
        }
        return prevIndex(nums, k, m-1);
        

    }

    static int[] BinarySearch (int [] nums,int k){
        int h = nums.length-1;
        int l = 0;
        int first = 0;
        int last = 0;
        int [] sol = new int[2];

        while (l <= h){
            int m = (l+h)/2;

            if (nums[m] == k){
                first = prevIndex(nums, k, m);
                last = nextIndex(nums, k, m);
                
                if (m != last && m != first){
                    sol[0] = first;
                    sol[1] = last;
                    return sol;
                }
                
                if (m != last) {
                    sol[0] = m;
                    sol[1] = last;
                    return sol;
                }
                if (m != first) {
                    sol[0] = first;
                    sol[1] = m;
                    return sol;
                }
                
                else {
                    sol[0] = m;
                    sol[1] = m;
                    return sol;
                }

            }
            
            if(nums[m] < k)
                l = m+1;

            else
                h = m - 1;
        }

        int [] nonums = {-1,-1};
        return nonums;
    }
    public static void main(String[] args) {
        int [] nums = {3,3,3};
        int k = 3;
        int [] ans = BinarySearch(nums,k);
        for(int i = 0;i <2;i++){
            System.out.println(ans[i]);
        }
    } 
}
