package EJ.Beginner.도형만들기1.숫자사각형4_2_Q5932;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){ //홀수 행이라면,
            if(i%2==0){ //홀수행? 0부터 시작해서 사람이 봤을 때 1행을 짝수라 보나?
                for(int j=n; j>=1; j--){
                    System.out.print(j+" ");
                }
            }else if(i%2==1){
                for(int j=1; j<=n; j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
