x = []

valor = int(input().strip())
x.append(valor)

for i in range(1,10):
    valor = x[i - 1] * 2
    x.append(valor)

for i in range (10):
    print(f'N[{i}] = {x[i]}')