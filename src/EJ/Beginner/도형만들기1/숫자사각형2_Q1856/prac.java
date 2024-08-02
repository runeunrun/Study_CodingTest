package EJ.Beginner.도형만들기1.숫자사각형2_Q1856;

import java.util.Scanner;

public class prac {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;
        int[][] arr = new int[n][m];

        for(int i = 0; i<n; i++){
            if(i%2==0){
                for(int j =0; j<m ; j++){
                    arr[i][j]=num++;
                }
            }else{
                for(int j = m-1; j>=0; j--){ //홀수 행일 때 주의해서 반복문 작성하기
                    arr[i][j] = num++;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j = 0; j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
