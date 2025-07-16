linhas = int(input().strip())

if 1 <= linhas <= 10**4:
    for _ in range(1, linhas+1): #Quantidade de loops
        entrada = input().strip()
        entrada_modificada = ''

        #PRIMEIRA PASSADA
        for char in entrada:
            if char.isalpha(): # Verifica se é uma letra
                entrada_modificada += chr(ord(char) + 3) # Altera a ordem dos caracteres 3 posições à direita
            else:
                entrada_modificada += char

        #SEGUNDA PASSADA
        entrada_invertida = entrada_modificada[::-1] # Inverte a string

        #TERCEIRA PASSADA
        metade = len(entrada_invertida)//2 # Vai identificar quantos elementos tem na string e "cortar" ela na metade
        metade1 = entrada_invertida[:metade] # A metade1 vai até onde houve o corte
        metade2 = "" #A metade 2 ainda não existe

        for c in entrada_invertida[metade:]:
            metade2 += chr(ord(c) - 1) # Movendo os caracteres da metade2 pra uma casa anterior

        entrada_final = metade1 + metade2 #Juntando as metades

        print(entrada_final)#Saída final

#Seloko, 1 hora aqui nesse exercício >:(