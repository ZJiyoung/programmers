def solution(n):
    if n % 7 != 0 :
        answer = n//7 + 1
    else: 
        answer = n/7
    return answer


# def solution(n):
#     answer = math.ceil(n/7)
#     return answer


'''
13/7 = 1.xx 
2 

몫을 구하라. 
단, 올림
'''