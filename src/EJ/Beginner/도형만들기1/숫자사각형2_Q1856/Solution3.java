package EJ.Beginner.도형만들기1.숫자사각형2_Q1856;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num =1;
        int temp = 0; //홀수행 시작점 관리를 위한 행

        for(int i = 0; i < n; i++){
            if(i%2==1){
                temp = num+m-1; //홀수 행 시작 수
                num=num+m; //짝수행 시작 수
            }
            for(int j = 0; j < m; j++){ //m열 만큼 반복
                if(i%2==1){ //홀수 행일 때
                    System.out.print(temp+" ");
                    temp--;
//                    continue;
                } else{
                System.out.print(num+" ");
                num++;}
            }
            System.out.println();
        }
    }
}
