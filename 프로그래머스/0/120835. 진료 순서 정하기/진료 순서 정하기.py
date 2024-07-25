def solution(emergency):
    answer = []
    order = sorted(emergency, reverse=True)
    
    order_map = dict() 
    
    for index, value in enumerate(order):
        order_map[value] = index
        
    for i in range(len(emergency)):
        answer += [order_map.get(emergency[i]) + 1]
    
    return answer 

'''
arrayname.sort()
sorted(arrayname)

내림차순정렬 
reverse = True

emergency [64, 8, 73] -> [2,1,3]
order [73, 64, 8] 
emergency 각 요소가 order에서 몇 번째 인덱스인지 (인덱스+1)

emergency 요소:인덱스 
emergency_map = dict()

answer = emergency_map.get(emergency[0]) + 1
'''