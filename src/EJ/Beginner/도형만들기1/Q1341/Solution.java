package EJ.Beginner.도형만들기1.Q1341;

public class Solution {
    static public void main(String arg[]) {
        for (int i = 1; i < 10; i += 3) {
            for (int j = 2; j < 10; j++) {
                for (int k = i; k < i + 3; k++) {
                    System.out.print(j + "*" + k + "=" + (j * k) + "\t");
                }
                System.out.println();
            }
        }
    }
}
