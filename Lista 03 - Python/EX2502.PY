while True:
    try:
        c, n = map(int, input().strip().split()) #A letra c refere-se a quantidade de letras das siglas padronizadas,
        #enquanto a letra n refere-se a quantidade de entradas que serão decodificadas.

        mapa = {} #Criação de dicionário

        #Leitura de duas linhas da cifra para fixar apadronização:
        linha1 = input()
        linha2 = input()

        #Leitura bidirecional das linhas de criptografia:
        for i in range (c):
            mapa[linha1[i].lower()] = linha2[i].lower() #Caracteres da linha 1 vão ser traduzidos em caracteres da linha 2
            mapa[linha2[i].lower()] = linha1[i].lower() #Caracteres da linha 2 serão traduzidos em caracteres da linha 1
        
        #Inicio da descriptografia:
        for _ in range (n):
            frase = input()#Frase a ser descriptografada
            resultado = ""#Variável que irá conter a frase descriptografada

            for char in frase: #Para cada caractere da frase criptografada será feito:

                minuscula = char.lower() #Transforma o caractere atual em minúsculo para fazer a verificação com o dicionário (que só contém minúsculas), sem perder a referência à capitalização original.
                if minuscula in mapa: 

                    #Se os caracteres minusculos da frase criptografada estiver dentro do dicionário:
                    troca = mapa[minuscula] #A variável troca receberá as letras presentes na tradução do dicionario

                    #Se o caractere original era maiúsculo, transforma a letra substituída para maiúscula também. Caso contrário, mantém como minúscula.
                    if char.isupper():
                        resultado += troca.upper()
                    else:
                        resultado += troca
                    
                    #Se o caractere não está na cifra, ele é mantido inalterado na saída.
                else:
                    resultado += char
            
            #Imprime a frase decifrada. Após cada conjunto de frases (n frases), imprime uma linha em branco como exigido pelo enunciado
            print(resultado)
        print()

    except EOFError:
        break
