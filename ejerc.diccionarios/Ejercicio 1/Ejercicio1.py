# Diccionario con 10 monedas y su valor en pesos colombianos
monedas = {
    'Euro': 4444,               # Valor de 1 Euro en pesos colombianos
    'Dólar': 4422,              # Valor de 1 Dólar estadounidense en pesos colombianos
    'Yen': 31.86,               # Valor de 1 Yen japonés en pesos colombianos
    'Libra': 5200,              # Valor de 1 Libra esterlina en pesos colombianos
    'Franco Suizo': 4600,       # Valor de 1 Franco suizo en pesos colombianos
    'Dólar Canadiense': 3300,   # Valor de 1 Dólar canadiense en pesos colombianos
    'Peso Mexicano': 250,       # Valor de 1 Peso mexicano en pesos colombianos
    'Real Brasileño': 900,      # Valor de 1 Real brasileño en pesos colombianos
    'Yuan': 650,                # Valor de 1 Yuan chino en pesos colombianos
    'Rupia India': 53           # Valor de 1 Rupia india en pesos colombianos
}

# Solicita al usuario la divisa a consultar
# .strip() elimina espacios en blanco al inicio y final
# .title() capitaliza la primera letra de cada palabra (para coincidir con las claves del diccionario)
divisa = input("Ingrese la divisa que desea consultar: ").strip().title()

# Solicita al usuario la cantidad que desea convertir de la divisa seleccionada
valor = float(input(f"Ingrese el valor en {divisa}: "))

# Verifica si la divisa ingresada está en el diccionario
if divisa in monedas:
    # Calcula la conversión multiplicando el valor ingresado por la tasa correspondiente
    conversion = valor * monedas[divisa]
    # Muestra el resultado con dos decimales
    print(f"{valor} {divisa} equivalen a {conversion:.2f} pesos colombianos.")
else:
    # Mensaje de error si la divisa no está en el diccionario
    print(f"La divisa '{divisa}' no está en el diccionario.")
