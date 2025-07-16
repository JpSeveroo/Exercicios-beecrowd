tempo = int(input())

horas = tempo//3600
tempo = tempo%3600

minutos = tempo//60
tempo = tempo%60

print(f'{horas}:{minutos}:{tempo}')