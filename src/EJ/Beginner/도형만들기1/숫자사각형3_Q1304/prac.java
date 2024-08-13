package EJ.Beginner.도형만들기1.숫자사각형3_Q1304;

import java.util.Scanner;

public class prac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;

        for(int i =0; i <n; i++){
            for(int j =0; j<n; j++){
                arr[j][i]=num++; //주의하기
            }
        }
        //배열의 모든 요소 출력하기
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}

