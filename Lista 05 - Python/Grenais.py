grenalGremio = 0
grenalInter = 0
empate = 0
grenais = 0

while True:
    golInter, golGremio = map(int, input().split())
    grenais += 1

    if golInter > golGremio:
        grenalInter += 1
    elif golGremio > golInter:
        grenalGremio += 1
    else:
        empate += 1

    print("Novo grenal (1-sim 2-nao)")
    escolha = int(input())

    if escolha == 2:
        break

print(f"{grenais} grenais")
print(f"Inter:{grenalInter}")
print(f"Gremio:{grenalGremio}")
print(f"Empates:{empate}")

if grenalInter > grenalGremio:
    print("Inter venceu mais")
elif grenalGremio > grenalInter:
    print("Gremio venceu mais")
else:
    print("Nao houve vencedor")
