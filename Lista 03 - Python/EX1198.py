i = 0.0
j = 1.0

while i <= 2:
    controlj = j
    for _ in range(3):
        if round(i, 10) % 1 == 0:
            str_i = f'{i:.0f}'
        else:
            str_i = f'{i:.1f}'

        if round(controlj, 10) % 1 == 0:
            str_control = f'{controlj:.0f}'
        else:
            str_control = f'{controlj:.1f}'

        print(f'I={str_i} J={str_control}')
        controlj += 1
    i += 0.2
    j += 0.2