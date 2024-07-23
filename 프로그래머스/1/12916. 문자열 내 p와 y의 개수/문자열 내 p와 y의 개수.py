def solution(s):
    answer = True
    
    if s.count('p') + s.count('P') == s.count('y') + s.count('Y'):
        answer = True
    elif s.count('p') + s.count('P') != s.count('y') + s.count('Y'):
        answer = False 
    else: 
        answer = True

    return answer

'''
p의 개수
P의 개수

y의 개수
Y의 개수
'''