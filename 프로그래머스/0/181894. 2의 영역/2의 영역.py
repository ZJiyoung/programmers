def solution(arr):
    answer = []
    start = 0
    end = 0
    
    if 2 not in arr :
        return [-1]
        
    for i in range(len(arr)):
        if arr[i] == 2:
            start = i
            break

    for j in range(len(arr)-1,-1,-1):
        if arr[j] == 2: 
            end = j 
            break

    for k in range(start, end+1): 
        answer.append(arr[k]) 

    return answer

'''
2가 처음 시작하는 인덱스 
마지막 2 인덱스 

검색 개념 
'''