def solution(name, yearning, photo):
    answer = []
    for ph in photo: #ph는 배열
        result = 0
        for p in range(len(ph)): #person은 ph내부인덱스
            for i in range(len(name)): 
                if ph[p] == name[i]:
                    result += yearning[i]
        answer.append(result)
                    
    return answer

'''
name
yearning 내부 요소 다 더하기 
photo[순서대로] 이중배열에서 name 요소 찾기
'''