tempo_segundos = int(input())  # Entrada do tempo total em segundos

tempo_horas = tempo_segundos // 3600  # Calcula o número de horas
resto_segundo = tempo_segundos % 3600  # Resto dos segundos após tirar as horas

tempo_minutos = resto_segundo // 60  # Calcula os minutos com o que sobrou
resto_segundo_restante = resto_segundo % 60  # O que sobra são os segundos finais

# Exibe no formato correto
print("{0}:{1}:{2}".format(tempo_horas, tempo_minutos, resto_segundo_restante))
