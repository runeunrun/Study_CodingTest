package EJ.Beginner.도형만들기1.문자사각형1_Q_1307;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        char ans = 'A';

        //오른쪽 아래에서부터 채워지는 배열 시작
        for(int i =n-1; i>=0; i--) { //열을 오른쪽에서 왼쪽으로 순회
            for(int j=n-1; j>=0; j--) { // 행을 아래에서 위쪽으로 순회
                arr[j][i] = ans; //j개의 행과 i개의 열로 이루어진 배열
                ans++;
                if(ans=='Z'){
                    ans='A';
                }
            }
        } //배열 출력
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
