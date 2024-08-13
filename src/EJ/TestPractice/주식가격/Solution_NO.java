package EJ.TestPractice.주식가격;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_NO {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        //과거 가격을 저장할 스택 생성
        Deque<Integer> stack = new ArrayDeque<>();

        //✅ 모든 인덱스를 순회한다.
        for (int i = 0; i < prices.length; i++) {
            //✅ 스택이 빌 때까지 반복한다.
            while (!stack.isEmpty()) {
                int j = stack.peek();
                //✅ 스택의 맨 위 인덱스의 가격이 현재 가격보다 큰지 확인한다.
                if (prices[j] > prices[i]) {
                    //✅ 인덱스간 차이를 저장하고, 스택 맨 위 인덱스를 제거한다.
                    answer[j] = i - j;
                    stack.pop();
                }
                //✅ 아니라면 빠져나온다.
                else break;
            }

            stack.push(i);
        }

        //✅ 스택에 남은 인덱스들에 대해 기간을 계산하여 저장한다.
        while (!stack.isEmpty()) {
            int i = stack.pop();
            answer[i] = prices.length - i - 1;
        }

        return answer;
    }
}
