package EJ.Beginner.도형만들기1.구구단1_Q1291;

public class Solution {

    public static void main(String args[]) {
        int s;
        int e;
        int k;
//        구구단 구분 1번
        for (k = 2; k <= 9; k++) {
            System.out.print("[ " + k + " 단 ]" + "\t");
        }
        System.out.println();
//        구구단 2번
        for (s = 1; s <= 9; s++) {
            ///3번
            for (e = 2; e <= 9; e++) {
                System.out.print(e + " * " + s + "= " + (s * e) + "\t"); //왜 s와 e 순서가 아니고 e와 s로 해야 정답이 나오는지 의문이다
            }
            System.out.println();
        }
    }
}
