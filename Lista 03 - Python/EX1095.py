x = 1 
y = 60
control = True

while (control):
    print(f'I={x} J={y}')
    x += 3
    y -= 5
    if y < 0:
        control = False