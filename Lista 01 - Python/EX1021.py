valor = float(input())

#Cédulas
notas100 = valor//100
valor = valor%100

notas50 = valor//50
valor = valor%50

notas20 = valor//20
valor = valor%20

notas10 = valor//10
valor = valor%10

notas5 = valor//5
valor = valor%5

notas2 = valor//2
valor = valor%2

#Moedas
moedas1cent = valor//1
valor = valor%1

moedas50cent = valor//0.50
valor = valor%0.50

moedas25cent = valor//0.25
valor = valor%0.25

moedas10cent = valor//0.1
valor = valor%0.1

moedas5cent = valor//0.05
valor = valor%0.05

moedas01cent = valor/0.01

print('NOTAS:')
print(f'{int(notas100)} nota(s) de R$ 100.00')
print(f'{int(notas50)} nota(s) de R$ 50.00')
print(f'{int(notas20)} nota(s) de R$ 20.00')
print(f'{int(notas10)} nota(s) de R$ 10.00')
print(f'{int(notas5)} nota(s) de R$ 5.00')
print(f'{int(notas2)} nota(s) de R$ 2.00')

print('MOEDAS:')
print(f'{int(moedas1cent)} moeda(s) de R$ 1.00')
print(f'{int(moedas50cent)} moeda(s) de R$ 0.50')
print(f'{int(moedas25cent)} moeda(s) de R$ 0.25')
print(f'{int(moedas10cent)} moeda(s) de R$ 0.10')
print(f'{int(moedas5cent)} moeda(s) de R$ 0.05')
print(f'{moedas01cent:.0f} moeda(s) de R$ 0.01')