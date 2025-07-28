// 장르별 x 2곡 
// 처음에 주어진 genre 배열의 인덱스가 고유번호 
// 1. genre 별로 모아서 plays 총합 
// 2. 총합이 높은 장르 순대로 2곡 씩 넣기 (결과는 인덱스)

import java.util.*; // Map, HashMap, List, ArrayList

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        // 정의
        Map<String, Integer> genrePlayMap = new HashMap<>();
        Map<String, List<int[]>> genreIndexMap = new HashMap<>();
        
        // 1. genre 별로 모아서 plays 총합 
        for (int i = 0; i < genres.length; i++){
            String genre = genres[i];
            Integer play = plays[i];
            
            // 딕셔너리 속 숫자 누적
            genrePlayMap.put(genre, genrePlayMap.getOrDefault(genre, 0) + play);
            // 딕셔너리 속 리스트에 추가 
            genreIndexMap.computeIfAbsent(genre, k -> new ArrayList<>()).add(new int[]{i, play}); // [i, play] i는 고유번호(index), play는 재생 수
        }
        
        // 2. 총합이 높은 장르 순대로 2곡 씩 넣기 
        // 재생 수 많은 순서대로 정렬 
        List<String> sortedGenres = new ArrayList<>(genrePlayMap.keySet());
        sortedGenres.sort((a, b) -> genrePlayMap.get(b) - genrePlayMap.get(a));
        
        // 결과 산출
        List<Integer> result = new ArrayList<>();
        
        for (String genre : sortedGenres) {
            List<int[]> songs = genreIndexMap.get(genre); 

            // 곡 정렬: 재생 수 내림차순, 같으면 index 오름차순
            songs.sort((a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1]; // 1순위: 재생 수 내림차순
                else return a[0] - b[0]; // 2순위: 고유번호 오름차순
            });

            // 상위 2개만 추가
            result.add(songs.get(0)[0]); // 첫 번째 곡
            if (songs.size() > 1) result.add(songs.get(1)[0]); // 두 번째 곡
        }
        
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
