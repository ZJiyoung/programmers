def solution(order):
    answer = 0
    order_str = str(order)
    for key in order_str:
        if key == '3' or key == '6' or key == '9':
            answer += 1
    return answer


'''
order을 str로 바꾸고 
거기서 3 6 9 들어간 개수 구하면 됨'''