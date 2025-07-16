n = int(input())

print(f'{n}')

notas100 = n//100
n = n%100

notas50 = n//50
n = n%50

notas20 = n//20
n = n%20

notas10 = n//10
n = n%10

notas5 = n//5
n = n%5

notas2 = n//2
n = n%2

print(f'{notas100} nota(s) de R$ 100,00')
print(f'{notas50} nota(s) de R$ 50,00')
print(f'{notas20} nota(s) de R$ 20,00')
print(f'{notas10} nota(s) de R$ 10,00')
print(f'{notas5} nota(s) de R$ 5,00')
print(f'{notas2} nota(s) de R$ 2,00')
print(f'{n} nota(s) de R$ 1,00')