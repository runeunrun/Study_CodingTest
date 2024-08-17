package EJ.Beginner.도형만들기1.문자사각형2_Q_1314;

import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        char ans = 'A';

        for(int i=0; i<n; i++){
            if(i%2==0){ //짝수열
                for(int j = 0; j<n; j++){ //행
                    arr[j][i] = ans;
                    ans++;
                    if(ans>'Z') {
                        ans = 'A';
                    }
                }
            } else{ //홀수열
                for(int j = n-1; j>=0; j--){
                    arr[j][i] = ans;
                    ans++;
                    if(ans>'Z') {
                        ans = 'A';
                    }
                }
            }
        } //배열 출력
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
}