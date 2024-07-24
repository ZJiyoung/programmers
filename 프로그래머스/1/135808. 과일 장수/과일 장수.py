def solution(k, m, score): 
    answer = 0
    p_sum = 0 
    
    sorted_score = sorted(score) #정렬
    
    if len(score) % m != 0:
        for i in range(len(score) % m) :
            sorted_score.pop(0) #전처리 (작은 나머지 요소들 삭제)
    
    for i in range(0,len(sorted_score),m):
        p_sum += sorted_score[i]
    
    answer = p_sum * m
    
    return answer

'''
p점 (1~k) * 사과개수m = 사과한상자가격

k=3, 
score = [1,2,3,1,2,3,1]
m=4
4 [2,2,3,3] 요소의 최솟값이 최대한 높아야 한다. 
3 
score의 요소를 순서대로 정렬 
한 상자에 들어갈 개수m만큼 분배 
최대한 p값이 크도록 (p는 k이하)

[4,1,2,2,4,4,4,4,1,2,4,2]
요소3개씩 4박스
[] 4 444 
[] 4 444 
[] 1 122 2 222
[] 1 122 1 112 
1 1 2 / 2 2 2 / 4 4 4 / 4 4 4
(p + p + p + p) x 3 
'''