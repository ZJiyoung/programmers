// lost: [2, 3, 5]
// _ 1 0 0 1 0 
// reserve: [4]
// _ 1 0 0 2 0 
// 3

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] clothes = new int[n + 2]; // 1번~n번, 양 끝 안전하게
        
        for (int i = 1; i <= n; i++){
            clothes[i] = 1;
        }
        
        for (int i: lost){
            clothes[i]--;
        }
        
        for (int i: reserve){
            clothes[i]++;
        }
        
        //clothes에서 0인 요소 좌우로 1이 있는지 확인 
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (clothes[i] >= 1){
                count++;
            }
            else if (clothes[i] == 0){
                if (clothes[i-1] == 2){
                    count++;
                    clothes[i-1] = 1;
                }
                else if (clothes[i+1] == 2){
                    count++;
                    clothes[i+1] = 1;
                }
            }
        }
        
        return count;
    }
}