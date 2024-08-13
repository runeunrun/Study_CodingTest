package EJ.Beginner.도형만들기1.숫자사각형1_Q1303;

import java.util.Scanner;

public class Solution {
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //높이
        int m = sc.nextInt(); //넓이
        int number =1; //이거 뭘까요

        for(int i=0; i<n; i++){ //m이 끝나고 n번째 줄로 넘어감
            for(int j=0; j<m; j++) {
                System.out.print(number+ " "); //초기값이 1이므로 1부터 m까지 나옴
                number++;
            }System.out.println();
        }
    }
}
