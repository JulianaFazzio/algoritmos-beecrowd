# Lê uma linha com três números separados por espaço
a, b, c = map(int, input().split())

# Calcula o maior entre a e b
maior_ab = (a + b + abs(a - b)) // 2

# Calcula o maior entre (a ou b) e c
maior = (maior_ab + c + abs(maior_ab - c)) // 2

# Mostra o maior
print(f"{maior} eh o maior")
