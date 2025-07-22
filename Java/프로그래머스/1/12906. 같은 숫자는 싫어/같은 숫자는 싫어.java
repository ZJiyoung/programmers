import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);  // 첫 값은 무조건 추가

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        // 리스트 → 배열 변환
        return list.stream().mapToInt(i -> i).toArray();
        
        // 배열 → 리스트 변환
        /*
        int[] arr = {1, 2, 3};

        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            list.add(n);
        }
        */
        
    }
}
