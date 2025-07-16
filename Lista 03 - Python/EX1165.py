entradas = int(input().strip()) 

for _ in range (entradas):
    n = int(input().strip())
    control = 0

    for i in range(1,n+1):
        if n % i == 0:
            control += 1

    if control == 2:
        print(f'{n} eh primo')
    else:
        print(f'{n} nao eh primo')