notas_validas = 0
soma = 0

while notas_validas < 2:
    n = float(input('').strip())
    if 0 <= n <= 10:
       soma += n
       media = soma/2
       notas_validas += 1
    else:
        print('nota invalida')

print(f'media = {media}')
    