//Divide 2 Integers

public class Q29 {
    static int divide(int dividend,int divisor){
        int t1 = dividend;
        int t2 = divisor; 
         if (dividend == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor==1){
            return Integer.MIN_VALUE;
        }
        if (dividend == Integer.MIN_VALUE){
            dividend++;
        }
        if (divisor == Integer.MIN_VALUE){
            divisor++;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int counter = 0;

        while (dividend > 0){
            dividend -= divisor;
            if (dividend < 0) {
                break;
            }
            counter++;
        }
        if (t1 == Integer.MIN_VALUE){
            return (counter+1)*-1;
        }

        else if (t1 < 0 && t2 < 0){
            return counter;
        }
        else if(t1 < 0 || t2 < 0){
            return counter*-1;
        }
        else{
            return 0;
        }
   }
    public static void main(String[] args) {
        int dend = -2147483648;
        int dsor = 2;
        System.out.println(divide(dend, dsor));
    }
}
