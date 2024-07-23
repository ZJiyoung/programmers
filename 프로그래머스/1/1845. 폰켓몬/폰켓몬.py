import random 

def solution(nums):
    answer = 0
    n = len(nums)/2
    
    nums_set = set(nums)
    
    if n > len(nums_set):
        answer = len(nums_set)
    else:
        answer = n
    # nums_sample = random.sample(nums, n)
    
    
    return answer


'''
3 1 2 3 
2마리 선택 가능

n개 중에서 n/2개 선택 가능 
서로 다른 숫자 개수 
n/2마리 중에서 최대한 서로 다른 숫자 많게 고르기

'''