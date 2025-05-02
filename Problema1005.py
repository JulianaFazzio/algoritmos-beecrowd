# Lê um número decimal (ponto flutuante) da entrada padrão e armazena na variável A
A = float(input())

# Lê outro número decimal e armazena na variável B
B = float(input())

# Calcula a média ponderada de A e B com pesos 3.5 e 7.5, respectivamente
# Fórmula: (A * 3.5 + B * 7.5) / 11
media = (A * 3.5 + B * 7.5) / 11

# Imprime o resultado da média com 5 casas decimais, no formato exigido
print(f"MEDIA = {media:.5f}")
