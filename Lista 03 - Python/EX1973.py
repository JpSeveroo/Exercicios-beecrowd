import sys
input = sys.stdin.readline

fazendas = int(input())
estrela = list(map(int, input().split()))

visitadas = 0
pos = 0
vis = [False] * fazendas

while 0 <= pos < fazendas and estrela[pos] > 0:
    if not vis[pos]:
        vis[pos] = True
        visitadas += 1

    current = estrela[pos]

    if current % 2 == 0:
        estrela[pos] -= 1
        pos -= 1
    else:
        estrela[pos] -= 1
        pos += 1

print(visitadas, sum(estrela))




