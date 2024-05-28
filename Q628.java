public class Q628 {
    static void maximumProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int sol = 1;
        for (int i = 0;i <= nums.length;i++){
            
            System.out.println("Loop I : " + i);
            

            for(int j = i+1;j <= nums.length;j++){
                System.out.println("    Loop J : " + i + " "+ j);
                for(int k = j+1;k <= nums.length;k++){
                    System.out.println("        Loop K : i : " + nums[i] + " j : "+ nums[j] +" k :"+ nums[k] +  " = " + i*j*k);
                    
                    if (i*j*k > maxProd){
                        sol = i*j*k;
                        maxProd = i*j*k;
                    }
                    else{}
                }
            }
            
        }
        System.out.println("Solution = " + sol);
    }

    public static void main(String[] args) {
        int[] nums = {0,-1,-2,-3};
        maximumProduct(nums);
    }
}


// public class Q628 {
//     static void maximumProduct(int[] nums) {
//         int maxProd = Integer.MIN_VALUE;
//         int sol = 1;
//         for (int i = 0;i <= nums.length;i++){
            
//             System.out.println("Loop I : " + i);
            

//             for(int j = i+1;j <= nums.length;j++){
//                 System.out.println("    Loop J : " + i + " "+ j);
//                 for(int k = j+1;k <= nums.length;k++){
//                     System.out.println("        Loop K : " + i + " "+ j +" "+ k +  " = " + i*j*k);
                    
//                     if (i*j*k > maxProd){
//                         sol = i*j*k;
//                         maxProd = i*j*k;
//                     }
//                     else{}
//                 }
//             }
            
//         }
//         System.out.println("Solution = " + sol);
//     }

//     public static void main(String[] args) {
//         int[] nums = {1,2,3};
//         maximumProduct(nums);
//     }
// }
