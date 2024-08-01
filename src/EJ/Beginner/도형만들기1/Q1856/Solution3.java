package EJ.Beginner.도형만들기1.Q1856;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num =1;
        int temp = 0;

        for(int i = 0; i < n; i++){
            if(i%2==1){
                temp = num+m-1;
                num=num+m;
            }
            for(int j = 0; j < m; j++){
                if(i%2==1){
                    System.out.print(temp+" ");
                    temp--;
                    continue;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
