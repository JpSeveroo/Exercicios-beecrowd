valor_t = int(input().strip())
control = 0
cond = True
vetor = []

if 2 <= valor_t <= 50:
    while cond:
        for i in range (valor_t):
            vetor.append(i)
            control += 1
            if control == 1000:
                cond = False

for i in range(1000):
    print(f'N[{i}] = {vetor[i]}')