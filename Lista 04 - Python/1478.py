while True:
    n = int(input().strip())
    if n == 0:
        break
    else:
        matriz = []
        for i in range(n):
            linha = []
            for j in range(n):
                valor = 1 + abs(i - j)
                linha.append(valor)
            matriz.append(linha)

        for linha in matriz:
            print(" ".join(f"{num:>3}" for num in linha))
        print() 

                

