def solution(babbling):
    answer = 0
    for i in babbling: 
        count = 0 
        for j in ['aya', 'ye', 'woo', 'ma']:
            if i.find(j) != -1:
                count += len(j)
        if count == len(i) :
            answer += 1
    return answer

#반례 : ayayak

'''
문자열 배열 요소 중에서 
aya ye woo ma 로만 
구성된 요소들을 찾아내기 

babbling 문자열 배열 요소 하나씩 검사 
각 요소에 4개 요소 중 하나가 있는지 검사 

한 단어의 길이 확인 2 3 2 3 
10개 이상이면 바로 answer에 1 카운트 안 됨 
10개 이하인 경우 4개 요소 한 번씩 전부 체크 
'''

