n = int(input())

c1 = 0
c2 = 1
c3 = 0

if 0 < n < 46:
    for i in range(1, n+1):
        
        if i == n:
            print(c1)
        else:
            print(c1, end = ' ')
            
        c3 = (c1+c2)
        c1 = c2
        c2 = c3