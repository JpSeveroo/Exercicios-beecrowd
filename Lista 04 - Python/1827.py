def solve():
    while True:
        try:
            n = int(input())
            matrix = [[0 for _ in range(n)] for _ in range(n)]

            inner_start = n // 3
            inner_end = n - 1 - (n // 3)
            center_r, center_c = n // 2, n // 2

            for r in range(n):
                for c in range(n):
                    is_center = (r == center_r and c == center_c)
                    is_inner = (inner_start <= r <= inner_end and \
                                inner_start <= c <= inner_end)
                    is_main_diag = (r == c)
                    is_secondary_diag = (r + c == n - 1)

                    if is_center:
                        matrix[r][c] = 4
                    elif is_inner:
                        matrix[r][c] = 1
                    elif is_main_diag:
                        matrix[r][c] = 2
                    elif is_secondary_diag:
                        matrix[r][c] = 3
                    else:
                        matrix[r][c] = 0
            
            for r in range(n):
                for c in range(n):
                    print(matrix[r][c], end="")
                print()
            print()

        except EOFError:
            break

if __name__ == "__main__":
    solve()