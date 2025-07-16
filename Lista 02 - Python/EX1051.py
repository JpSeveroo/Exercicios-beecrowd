imposto = float(input())

if 0 <= imposto <= 2000:
    print('Isento')

elif 2000 < imposto <= 3000:
    excedente1 = imposto - 2000
    valor1 = excedente1 * 0.08
    print(f'R$ {valor1:.2f}')

elif 3000 < imposto <= 4500:
    excedente1 = 3000 - 2000
    excedente2 = imposto - 3000
    valor1 = excedente1 * 0.08
    valor2 = excedente2 * 0.18
    valor_final = valor1 + valor2
    print(f'R$ {valor_final:.2f}')
    
else:
    excedente1 = 3000 - 2000
    excedente2 = 4500 - 3000
    excedente3 = imposto - 4500
    valor1 = excedente1 * 0.08
    valor2 = excedente2 * 0.18
    valor3 = excedente3 * 0.28
    ult_valor_final = valor1 + valor2 + valor3
    print(f'R$ {ult_valor_final:.2f}')