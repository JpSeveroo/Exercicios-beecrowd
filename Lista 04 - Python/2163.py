matriz = []
linhas, colunas = map(int, input().split())

for _ in range(linhas):
    vetor = list(map(int, input().split()))
    matriz.append(vetor)

encontrado = False

for i in range(1, linhas - 1):
    for j in range(1, colunas - 1):
        if matriz[i][j] == 42:
            if (matriz[i-1][j] == 7 and matriz[i+1][j] == 7 and
                matriz[i][j-1] == 7 and matriz[i][j+1] == 7 and
                matriz[i-1][j-1] == 7 and matriz[i-1][j+1] == 7 and
                matriz[i+1][j-1] == 7 and matriz[i+1][j+1] == 7):
                print(f'{i+1} {j+1}')
                encontrado = True
                break
    if encontrado:
        break
if not encontrado:
    print("0 0")