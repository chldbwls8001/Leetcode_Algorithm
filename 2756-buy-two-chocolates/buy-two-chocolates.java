/*
prices[]: 각 초콜릿의 가격을 원소로 하는 배열
money: 가지고 있는 돈
answer: prices[]에서 두 개의 초콜릿을 구매하고 남은 금액을 반환
    answer >= 0, 돈이 부족한 경우(answer < 0) money를 반환
*/

import java.util.*;

class Solution {
    public int buyChoco(int[] prices, int money) {

        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) { // 두 초콜릿의 금액의 합의 최솟값을 구함
            for (int j = i + 1; j < prices.length; j++) {
                int sum = prices[i] + prices[j];
                answer = Math.min(answer, sum);
            }
        }

        if ((money - answer) >= 0) {
            return money - answer;
        }
        else {
            return money;
        }

    }
}