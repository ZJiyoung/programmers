def solution(numbers):
    answer = 0
    multi = []
    for i in range(0,len(numbers)):
        for j in range(0,len(numbers)):
            if i != j :
                multi.append(numbers[i]*numbers[j])
    answer = max(multi)
    return answer