while True:
    try:
        n = int(input())
        if n == 0:
            break

        for i in range(n):
            linha = []
            for j in range(n):
                valor = min(i, j, n - 1 - i, n - 1 - j) + 1 #Sacanagem ter que saber dessa fórmula
                linha.append(f"{valor:3}")
            print(" ".join(linha))
        print()  # linha em branco entre matrizes

    except EOFError:
        break
