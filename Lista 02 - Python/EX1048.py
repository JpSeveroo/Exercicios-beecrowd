salario = float(input().strip())

if 0 <= salario <= 400:
    reajuste1 = salario * 0.15
    novo_salario1 = salario + reajuste1
    print(f'Novo salario: {novo_salario1:.2f}')
    print(f'Reajuste ganho: {reajuste1:.2f}')
    print('Em percentual: 15 %')

elif 400 < salario <= 800:
    reajuste2 = salario * 0.12
    novo_salario2 = salario + reajuste2
    print(f'Novo salario: {novo_salario2:.2f}')
    print(f'Reajuste ganho: {reajuste2:.2f}')
    print('Em percentual: 12 %')

elif 800 < salario <= 1200:
    reajuste3 = salario * 0.1
    novo_salario3 = salario + reajuste3
    print(f'Novo salario: {novo_salario3:.2f}')
    print(f'Reajuste ganho: {reajuste3:.2f}')
    print('Em percentual: 10 %')
    
elif 1200 < salario <= 2000:
    reajuste4 = salario * 0.07
    novo_salario4 = salario + reajuste4
    print(f'Novo salario: {novo_salario4:.2f}')
    print(f'Reajuste ganho: {reajuste4:.2f}')
    print('Em percentual: 7 %')
    
else:
    reajuste5 = salario * 0.04
    novo_salario5 = salario + reajuste5
    print(f'Novo salario: {novo_salario5:.2f}')
    print(f'Reajuste ganho: {reajuste5:.2f}')
    print('Em percentual: 4 %')