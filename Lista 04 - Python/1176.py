n = int(input().strip())

for _ in range (n):
    test = int(input().strip())
    if 0 <= test <= 60:
        x = []
        a, b = 0,1 

        for i in range(test+1):
            x.append(a)
            a, b = b, a+b
            
        print(f'Fib({test}) = {x[test]}')