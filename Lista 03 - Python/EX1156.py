seq = 1.0
numerador = 1
denominador = 1

while numerador < 39:
    numerador += 2
    denominador *= 2
    seq += numerador / denominador

print(f'{seq:.2f}')