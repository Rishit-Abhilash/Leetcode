import java.util.Scanner;

public class Q1672 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Columns : ");
        int c = sc.nextInt();
        System.out.print("Rows : ");
        int r = sc.nextInt();
        System.out.println("");

        int [][] nums = new int[r][c];
        int maxSum = -1;
        for (int i = 0;i < r;i++){
            int sum = 0;
            for (int j = 0;j < c;j++){
                nums[i][j] = sc.nextInt();
                sum += nums[i][j]; 
            }
            if (sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);

        

        sc.close();
    }
}
