package EJ.Beginner.도형만들기1.숫자사각형3_Q1304;

import java.util.Scanner;

//숫자 사각형3
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        int num = 1;

        //반복문 시행
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j]=num++; //왜?? arr[j][i]=num++;
            }
        }
        //배열의 각 요소 모두 출력하기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
