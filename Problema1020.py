# Lê do usuário um número inteiro representando a quantidade total de dias
dias_pessoa = int(input())

# Calcula quantos anos completos há no total de dias (considerando 365 dias por ano)
anos_pessoa = dias_pessoa // 365

# Calcula o restante de dias que sobraram após tirar os anos
resto_dias_pessoa = dias_pessoa % 365

# Calcula quantos meses completos cabem no restante (considerando 30 dias por mês)
meses_pessoa = resto_dias_pessoa // 30

# Calcula os dias que sobraram após tirar os meses
resto_dias = resto_dias_pessoa % 30

# Exibe o resultado formatado, com os anos, meses e dias
print(f"{anos_pessoa} ano(s)")
print(f"{meses_pessoa} mes(es)")
print(f"{resto_dias} dia(s)")
