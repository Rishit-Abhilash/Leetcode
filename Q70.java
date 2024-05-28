import java.util.Scanner;

public class Q70 {
    static int climbStairs(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sol = climbStairs(x);
        System.out.println(sol);
        sc.close();
    }
}
