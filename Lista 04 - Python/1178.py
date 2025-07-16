vetor = []
entrada = float(input().strip())
for i in range(100):
    vetor.append(entrada)
    entrada /= 2

for i in range(100):
    print(f'N[{i}] = {vetor[i]:.4f}')