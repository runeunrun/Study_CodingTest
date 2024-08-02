package EJ.Beginner.도형만들기1.숫자사각형2_Q1856;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] arr = new int[n][m]; //배열의 선언과 생성을 동시에. 배열의 크기는 n 과 m이다
    int num =1;
    for(int i=0;i<n;i++){
        if(i%2==0){ //짝수라면,
            for(int j=0;j<m;j++){
                arr[i][j] = num++; //숫자가 배열의 크기인 n과 m 만큼 증가
            }
        }else { //홀수라면
            for(int j=m-1;j>=0;j--){ //j=m-1뭔말?
                arr[i][j] = num++; //숫자가 배열의 크기인 n과 m 만큼 증가
            }
        }
    }

    for(int i=0;i<n;i++) { //왜 한 번더 반복할까?
        for(int j = 0;j<m;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
        }
    }
}
