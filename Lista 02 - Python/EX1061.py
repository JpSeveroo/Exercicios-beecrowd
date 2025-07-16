dia_inicio = int(input().split()[1])

hh, mm, ss = map(int, input().strip().split(' : '))

dia_fim = int(input().split()[1])  

h, m, s = map(int, input().strip().split(' : '))  

inicio_segundos = (dia_inicio * 86400) + (hh * 3600) + (mm * 60) + ss
fim_segundos = (dia_fim * 86400) + (h * 3600) + (m * 60) + s

tempo_total = fim_segundos - inicio_segundos

if tempo_total < 60:
    tempo_total = 60

dias = tempo_total // 86400
tempo_total %= 86400

horas = tempo_total // 3600
tempo_total %= 3600

minutos = tempo_total // 60
segundos = tempo_total % 60

print(f'{dias} dia(s)')
print(f'{horas} hora(s)')
print(f'{minutos} minuto(s)')
print(f'{segundos} segundo(s)')
