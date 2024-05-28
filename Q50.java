public class Q50 {

    static double myPow(double x, int n) {
        
        int temp = n;
        double e = n;
        if(e < 0){
            e = e*-1;
        }
        double ans = 1;
        
        for(int i = 0;i < e;i++){
            ans = ans*x;
        }
       
        if (temp < 0){
            return 1/ans;
        }
        else{
            return ans;
        }    
    }
    public static void main(String[] args) {
        double x = 2;
        int n = -2;

        System.out.println(myPow(x, n));
    }
}
