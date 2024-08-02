package EJ.Beginner.도형만들기1.숫자사각형2_Q1856;

import java.util.Scanner;

public class prac2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); // System.in 꼭 넣어주기
        int n = sc.nextInt();
        int m = sc.nextInt();

        //배열 생성 및 정의
        int[][] arr = new int[n][m];

        int num = 1;
        //반복문 시작
        for(int i = 0; i < n; i++){
            if(i%2==0){ //짝수행
                for(int j = 0; j<m; j++){
                    arr[i][j]=num++;
                }
            }else if(i%2==1) { //홀수행
                for(int j=m-1; j>=0; j--){
                    arr[i][j]=num++;
                }
            }
        }
        //배열의 모든 값을 출력하기
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}