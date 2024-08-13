package EJ.TestPractice.주식가격;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_dy {
    /*
    문제: 각 가격마다 해당 가격이 떨어지지 않은 초를 기록하여 반환
    */
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; //반환할 정답 배열 생성: 각 인덱스(시점)의 가격 미하락 기간 기록

        //과거 가격을 저장할 스택 생성
        Deque<Integer> past = new ArrayDeque<>();

        //1. 주어진 배열(prices)을 처음부터 끝까지 순회
        for(int sec=0; sec<prices.length; sec++) {
            //2. 현재 시점 인덱스(시점)를 스택에 저장
            //2-1. [ 스택이 비어있지 않고 스택에 저장된 (이전)가격이 현재 시점 가격보다 높을 경우 ], 스택에서 (이전)인덱스(시점)를 삭제하고 가격 미하락 기간을 계산하여 정답 배열에 저장
            //     :: 위 조건을 만족하지 않을 때까지(현재 가격이 이전 가격보다 높아질 때까지) 반복
            while(!past.isEmpty() && prices[sec] < prices[past.peek()]) {
                int pastSec = past.pop(); //이전 가격 시점
                answer[pastSec] = sec - pastSec; //가격 미하락 구간 계산 & 기록
            }
            //2-2. 위 반복문을 끝내고 나면, 현재 시점 인덱스(시점)를 스택에 저장
            past.push(sec);
        }

        //3. 주어진 배열 순회가 끝난 뒤(주어진 시간 종료), 스택에 남아있는 인덱스(시점)가 있는지 확인
        //4. 인덱스(시점)가 남아있다면, 그 인덱스(시점)의 가격은 주어진 시간이 종료될 때까지 가격이 떨어지지 않았다는 의미 -> 이 가격들에 대해서도 가격 미하락 기간을 계산하여 정답 배열에 저장
        //5. 스택이 빌 때까지 반복해서 (총 시간 - 1) - 각 인덱스(시점) 식으로 계산하여 기간을 기록
        while(!past.isEmpty()) {
            int pastSec = past.pop(); //가격 시점
            answer[pastSec] = prices.length-1 - pastSec; //가격 미하락 구간 계산 & 기록
        }

        //정답 배열 반환
        return answer;
    }

}