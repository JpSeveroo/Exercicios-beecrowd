n = int(input('').strip())
c = 0

while c < n:
    number1, number2 = sorted(map(int, input('').strip().split()))
    soma = 0
    for i in range(number1 + 1, number2):
        if i % 2 != 0:
            soma += i
    
    print(f'{soma}')
    c += 1