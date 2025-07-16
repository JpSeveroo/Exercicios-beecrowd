A, B, C, D = map(int, input().strip().split())

triangulo1 = A + B > C and A + C > B and B + C > A
triangulo2 = A + B > D and A + D > B and B + D > A
triangulo3 = A + C > D and A + D > C and C + D > A
triangulo4 = B + C > D and B + D > C and C + D > B

if triangulo1 or triangulo2 or triangulo3 or triangulo4:
    print('S')
else:
    print('N')

