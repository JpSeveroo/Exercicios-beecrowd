casos = int(input())

for _ in range(casos):
    jog1 = input()
    jog2 = input()
    dicionario = {
        ('pedra','papel'): 'Jogador 1 venceu',
        ('pedra','ataque'): 'Jogador 2 venceu',
        ('pedra','pedra'): 'Sem ganhador',
        ('papel','pedra'): 'Jogador 2 venceu',
        ('papel','papel'): 'Ambos venceram',
        ('papel','ataque'): 'Jogador 2 venceu',
        ('ataque','papel'): 'Jogador 1 venceu',
        ('ataque','ataque'): 'Aniquilacao mutua',
        ('ataque','pedra'): 'Jogador 1 venceu'
    }
    resultado = dicionario.get((jog1,jog2))
    print(resultado)