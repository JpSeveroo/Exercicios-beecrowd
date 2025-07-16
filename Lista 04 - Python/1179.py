vetor_imp = []
vetor_par = []
cont = 0

while cont < 15:
    valor = int(input().strip())
    
    if valor % 2 == 0:
        vetor_par.append(valor)
        if len(vetor_par) == 5:
            for i in range(5):
                print(f'par[{i}] = {vetor_par[i]}')
            vetor_par.clear()
    else:
        vetor_imp.append(valor)
        if len(vetor_imp) == 5:
            for i in range(5):
                print(f'impar[{i}] = {vetor_imp[i]}')
            vetor_imp.clear()
    
    cont += 1

for i in range(len(vetor_imp)):
    print(f'impar[{i}] = {vetor_imp[i]}')

for i in range(len(vetor_par)):
    print(f'par[{i}] = {vetor_par[i]}')