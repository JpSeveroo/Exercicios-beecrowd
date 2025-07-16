i = 1 
j = 7 

while i <= 9 :
    controlj = j
    for _ in range (3):
        print(f'I={i} J={controlj}')
        controlj -= 1
    i += 2
    j += 2