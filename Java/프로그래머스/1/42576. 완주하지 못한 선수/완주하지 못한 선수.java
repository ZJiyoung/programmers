// 배열 participant에서 배열 completion에 없는 요소 1개 찾기 

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 1. 참가자들 이름을 map에 기록 (이름: 몇 번 나왔는지 세기)
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1); // 기본값, 중복될수록 + 1
        }

        // 2. 완주한 사람은 -1 해서 참가자 수에서 제거
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 3. 아직 1이 남아 있는 사람이 = 완주 못한 사람
        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                return name;
            }
        }
        return "";
    }
}