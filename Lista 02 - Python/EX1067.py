n = int(input().strip())

if 1 <= n <= 1000:
    print(1)
    for i in range(3, n + 1, 2):
        print(i)