i = 1
j = 7
parada = True

while parada:
    for cont in range(3):
        print(f'I={i} J={j}')
        j -= 1
    if i == 9:
        parada = False
    i += 2
    j = 7