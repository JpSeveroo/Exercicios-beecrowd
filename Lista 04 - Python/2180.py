peso = int(input().strip())
cont = 0
vel = 0

def primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

while cont < 10:
    if primo(peso):
        vel += peso
        cont += 1
    peso += 1

horas = int(60000000 / vel)
dias = int(horas/24)


print(f'{vel} km/h')
print(f'{horas} h / {dias} d')
