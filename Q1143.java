public class Q1143 {
    static int longestCommonSubsquence(String text1, String text2){
       
        return helper(text1, text2, 0, 0);
    }

    static int helper(String text1,String text2,int i, int j) {
       
        if(i==text1.length()){

        }
        char ch1 =text1.charAt(i);
        char ch2= text2.charAt(j);

        if (ch1 == ch2){
            return 1 + helper(text1,text2,i+1,j+1);
        }
        else{
            int ans1 = helper(text1, text2, i+1, j);
            int ans2 = helper(text1, text2, i, j+1);
            return Math.max(ans1, ans2);

        }
    }

    public static void main(String[] args) {
        String t1 = "abcde";
        String t2 = "ace";
        int a = longestCommonSubsquence(t1, t2);
        System.out.println(a);
    }
}
