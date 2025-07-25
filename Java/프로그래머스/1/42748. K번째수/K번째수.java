// 1. new = arr[i-1] ~ arr[j-1]
// 2. new = new.sorted()
// 3. new[k-1]

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // int[] answer = {}; // 크기 고정 
        List<Integer> answer = new ArrayList<>(); // 크기 유동적
        
        for (int[] arr : commands){
            // int i, j, k = arr; // java에서는 불가 
            int i = arr[0];
            int j = arr[1];
            int k = arr[2];
            
            // 1
            int[] sliced = Arrays.copyOfRange(array, i-1, j); // copyOfRange(array, from, to)는 [from, to) 즉, to는 포함되지 않기 때문에 j번째 원소까지 자르려면 j-1이 아니라 j가 돼야 함.
            // 2
            Arrays.sort(sliced);
            // 3
            answer.add(sliced[k - 1]);
        }
        
        return answer.stream().mapToInt(i -> i).toArray(); // List<Integer> → int[]
    }
}