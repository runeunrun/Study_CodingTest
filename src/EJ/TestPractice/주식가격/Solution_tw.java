package EJ.TestPractice.주식가격;

import java.util.Stack;

public class Solution_tw {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        //과거 가격을 저장할 스택 생성
        Stack<Integer> stack = new Stack<>();

        //현재 가격과 바라보고 있는 가격의 시간 차이를 알아보기
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) { //스택이 비지 않거나, 바라보고 있는 가격이 현재 가격보다 크면 돌아라
                answer[stack.peek()] = i - stack.peek(); //구간 계산 : 기준 가격의 초-바라보고 있는 가격의 초, 스택에서 뽑아낸 값을 answer 배열의 순서로 사용하며 그걸 답으로 낸다.
                stack.pop(); //마무리 => 현재 가격이 바라보고 있는 가격보다 작으면 pop(삭제) 한다고 생각해서 마무리라고 했음
            }
            stack.push(i); //지금까지 스택에 저장
        }
        //스택에 남아 있는 가격의 시간 차이를 계산하기.
        while (!stack.isEmpty()) { //스택이 비지 않을 때까지 돌아라
            answer[stack.peek()] = prices.length - stack.peek() - 1; //배열 전체 크기 - 바라보고 있는 가격 시점 -1(배열이므로 0부터 시작)
            stack.pop(); //마무리
        }
        return answer;
    }
}
