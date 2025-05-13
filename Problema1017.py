# Lê o tempo gasto na viagem (em horas) e converte para inteiro
tempo = int(input())

# Lê a velocidade média da viagem (em km/h) e converte para inteiro
velocidade_media = int(input())

# Calcula a distância percorrida: distância = velocidade × tempo
distancia_percorrida = velocidade_media * tempo

# Calcula o total de litros de combustível gasto
# Sabendo que o carro faz 12 km por litro
calculo_gasolina = distancia_percorrida / 12

# Imprime o resultado com 3 casas decimais
print(f"{calculo_gasolina:.3f}")
