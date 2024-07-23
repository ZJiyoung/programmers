def solution(n):
    answer = []
    if n % 2 == 0:
        for i in range(1,n,2):
            answer.append(i)
        
    else: 
        for i in range(1,n+1,2):
            answer.append(i)
    return answer

'''
8 
1 3 5 7
'''