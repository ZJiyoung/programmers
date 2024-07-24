def solution(id_list, report, k):
    # 신고당한횟수배열 b
    # 신고적중횟수배열 aa
    b = [0] * len(id_list)
    aa = [0] * len(id_list)
    arr = []
    blocked = []
    
    new_report = list(set(report)) 
    
    id_list_map = dict()
    
    for index, id in enumerate(id_list):
        id_list_map[id] = index
    
    #리포트스캔 (신고받은횟수카운트)
    for i in range(len(new_report)):
        arr = new_report[i].split() 
              # 신고한 사람 arr[0]
              # 신고당한 사람 arr[1] 
        id_index = id_list_map.get(arr[1])
        b[id_index] += 1
        # for j in range(len(id_list)):
        #     if id_list[j] == arr[1]:
        #         b[j] += 1 
            
    
    # 차단된사람 배열
    for i in range(len(id_list)):
        if b[i] >= k:
            blocked.append(id_list[i])
            
    # blocked리스트에 있는 사람을 신고한 사람 
    for i in range(len(new_report)):
        arr = new_report[i].split()
        if arr[1] in blocked: 
            aa[id_list.index(arr[0])] += 1
        # arr[0]에 해당하는 사람 인덱스

    return aa

'''
id_list
muzi frodo apeach neo

report
muzi frodo
apeach frodo
frodo neo
muzi neo
apeach muzi

k=2

각 유저별로 처리결과 메일을 받은 횟수 
자기가 신고한 유저 중 / 몇 명이나 k번 이상 신고를 당했는지
'''
