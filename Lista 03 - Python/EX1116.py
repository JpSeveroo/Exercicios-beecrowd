n = int(input('').strip())
c = 0

while c < n:
    number1, number2 = map(int,input('').strip().split())
    
    if number2 == 0:
        print('divisao impossivel')
    else:
        print(f'{number1/number2:.1f}')
    c += 1