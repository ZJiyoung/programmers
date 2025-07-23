// 총 N마리 중에서 N/2마리만 선택 가능
// 다양한 종류를 고르기 위해 중복된 종류는 1번만 셈
// 고유한 폰켓몬 종류 수 = Set.size()
// 실제로 고를 수 있는 종류 수 = Math.min(Set.size(), N / 2)

import java.util.*; // 이 패키지 꼭 써줘야 Set과 HashSet 사용 가능 

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 중복제거한 요소 
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);  // 고유한 종류만 저장됨
        }
        
        // N / 2
        int N = nums.length;
        
        // answer 
        answer = Math.min(set.size(), N / 2);
        
        return answer;
    }
}