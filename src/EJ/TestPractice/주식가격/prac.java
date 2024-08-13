package EJ.TestPractice.주식가격;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class prac {
    public int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
        Deque<Integer>stack = new ArrayDeque<>();

        for(int i =0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[i]<prices[stack.peek()]){
                answer[stack.peek()]= i - stack.peek();
                stack.pop();
            }stack.push(i);
        }while(!stack.isEmpty()){
            answer[stack.peek()]=prices.length-stack.peek()-1;
            stack.pop();
        }return answer;
    }
}