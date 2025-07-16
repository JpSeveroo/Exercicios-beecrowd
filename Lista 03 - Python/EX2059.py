p, j1, j2, r, a = map(int, input().strip().split())

soma = j1 + j2
escolha_j1 = (soma % 2 == 0 and p == 1) or (soma % 2 != 0 and p == 0)

r = True if r == 1 else False
a = True if a == 1 else False

vencedor1 = "Jogador 1 ganha!"
vencedor2 = "Jogador 2 ganha!"

if r and not a:
    print(vencedor1)
elif r and a:
    print(vencedor2)
elif not r and a:
    print(vencedor1)
else:
    if escolha_j1:
        print(vencedor1)
    else:
        print(vencedor2)
