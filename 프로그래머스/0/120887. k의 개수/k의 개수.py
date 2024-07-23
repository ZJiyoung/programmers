def solution(i, j, k):
    answer = 0
    for num in range(i,j+1):
        num_str = str(num)
        for key in num_str:
            if key == str(k) :
                answer += 1
        # if num_str.count('k') > 0:  
        #     answer += key.count('k')
    return answer


'''
i부터 j까지의 수를 모두 분해해서 1자리 수로 나타내야 함

10 11 12 13
10 
'10'
for key in '10'
'1', '0'
'''