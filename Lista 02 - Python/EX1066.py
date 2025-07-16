pos = 0
neg = 0
par = 0
impar = 0

for _ in range(1, 6):
    n = int(input())
    if n < 0:
        neg = neg+1
    elif n > 0:
        pos = pos+1

    if n%2 == 0:
        par = par + 1
    
    else:
        impar = impar + 1

print(f'{par} valor(es) par(es)')
print(f'{impar} valor(es) impar(es)')
print(f'{pos} valor(es) positivo(s)')
print(f'{neg} valor(es) negativo(s)')