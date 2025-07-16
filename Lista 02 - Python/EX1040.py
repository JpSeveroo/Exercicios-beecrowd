n1, n2, n3, n4 = map(float, input().split())

soma_dos_pesos = 2 + 3 + 4 + 1
media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / soma_dos_pesos

print(f'Media: {media:.1f}')

if media >= 7:
    print('Aluno aprovado.')

elif 5 <= media <= 6.9:
    print('Aluno em exame.')
    nota = float(input())
    print(f'Nota do exame: {nota:.1f}')
    
    recalculo = (media + nota) / 2

    if recalculo >= 5:
        print('Aluno aprovado.')
    else:
        print('Aluno reprovado.')

    print(f'Media final: {recalculo:.1f}')
else:
    print('Aluno reprovado.')