import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new HashSet<>(); // 중복 불가 
        
        // for문으로 돌면서 더해서 나올 수 있는 수 전부 구하기 
        for (int i = 0 ; i < numbers.length ; i++){
            for (int j = i+1 ; j < numbers.length ; j++){
                sumSet.add( numbers[i] + numbers[j] );
            }
        }
        

        // Set -> List -> 정렬
        List<Integer> resultList = new ArrayList<>(sumSet);
        Collections.sort(resultList); // Collections.sort()는 리스트(List)를 정렬할 때 쓰는 메서드

        // List -> int[] 변환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}