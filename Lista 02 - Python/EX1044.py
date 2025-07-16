a, b = map(int,input().strip().split())

if a%b == 0 or b%a == 0:
    print('Sao Multiplos')

else:
    print('Nao sao Multiplos')