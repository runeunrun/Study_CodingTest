package EJ.Beginner.도형만들기1.숫자사각형4_3_Q5933;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(i*j+" ");
            }System.out.println();
        }
    }
}
