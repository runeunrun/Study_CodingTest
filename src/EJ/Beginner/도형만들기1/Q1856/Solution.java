package EJ.Beginner.도형만들기1.Q1856;

import java.util.Scanner;

public class Solution {public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int i, j;
    int[][] arr=new int[n][m] ; //배열의 선언과 생성을 동시에. 배열의 크기는 n 과 m이다
    int num = 1;

    for(i=0;i<n;i++){
        if(n%2==0){
            for(j=0;j<m;j++){
                arr[i][j] = num++; //숫자가 배열의 크기인 n과 m 만큼 증가
            }System.out.println(num);
        }else if(n%2 == 1){
            for(j=m-1;j>=0;j--){
                arr[i][j] = num++; //숫자가 배열의 크기인 n과 m 만큼 증가
            }
        }
    }
    for(i=0;i<n;i++) {
        for(j = 0;j<m;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
}
}
