xf, yf, xi, yi, vi, r1, r2 = map(int, input().strip().split())

distancia_inicial = ((xf - xi)**2 + (yf - yi)**2)**(0.5)
deslocamento_inimigo = vi * 1.5
distancia_final = deslocamento_inimigo + distancia_inicial

if distancia_final <= (r2+r1):
    print('Y')
else:
    print('N')
