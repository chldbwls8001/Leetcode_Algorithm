// 배열 nums의 원소 중 '두 원소의 합 == target의 값' 조건을 만족하는 두 원소의 인덱스 값을 배열 형태로 반환

/*
sol1) 이중 for문
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }
}