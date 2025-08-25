# Diccionario con 10 monedas y su valor en pesos colombianos
monedas = {
    'Euro': 4444,
    'Dólar': 4422,
    'Yen': 31.86,
    'Libra': 5200,
    'Franco Suizo': 4600,
    'Dólar Canadiense': 3300,
    'Peso Mexicano': 250,
    'Real Brasileño': 900,
    'Yuan': 650,
    'Rupia India': 53
}

divisa = input("Ingrese la divisa que desea consultar: ").strip().title()
valor = float(input(f"Ingrese el valor en {divisa}: "))

if divisa in monedas:
    conversion = valor * monedas[divisa]
    print(f"{valor} {divisa} equivalen a {conversion:.2f} pesos colombianos.")
else:
    print(f"La divisa '{divisa}' no está en el diccionario.")
