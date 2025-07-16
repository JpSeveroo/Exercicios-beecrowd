linha = int(input().strip())
opr = input().strip().upper()

soma = 0
matriz = []

for i in range(12):
    linha_matriz = []
    for j in range (12):
        valor = float(input().strip())
        linha_matriz.append(valor)
    matriz.append(linha_matriz)

for i in range (12):
    soma += matriz[linha][i]

if opr == 'S':
    print(f'{soma:.1f}')
elif opr == 'M':
    media = soma / 12
    print(f'{media:.1f}')