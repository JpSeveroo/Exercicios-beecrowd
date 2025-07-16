try:
    while True:
        cond1 = False
        cond2 = False
        cpf = input()
        cpf_limpo = cpf.replace(".", "").replace("-", "")
        vetor = list(cpf_limpo)
        vetor_att = []
        vetor_int = []

        for i in range(len(vetor)):
            vetor_att.append(vetor[i])
        for j in range(len(vetor)):
            vetor_int.append(int(vetor_att[j]))

        soma1 = sum(vetor_int[i] * (i + 1) for i in range(9))
        dig1_calculado = soma1 % 11
        if dig1_calculado == 10:
            dig1_calculado = 0

        soma2 = sum(vetor_int[i] * (9 - i) for i in range(9))
        dig2_calculado = soma2 % 11
        if dig2_calculado == 10:
            dig2_calculado = 0

        if dig1_calculado == vetor_int[9] and dig2_calculado == vetor_int[10]:
            print('CPF valido')
        else:
            print('CPF invalido')

except EOFError:
    pass