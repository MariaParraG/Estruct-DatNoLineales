# Diccionario con los precios de los repuestos
repuestos = {
    'Bujia': 1.40,               # Precio de una bujía en dólares
    'Pastillas De Freno': 5.80,  # Precio de un juego de pastillas de freno en dólares
    'Radiador': 300.50,          # Precio de un radiador en dólares
    'Rodamiento': 10.70          # Precio de un rodamiento en dólares
}

# Solicitar al usuario el nombre del repuesto
# .strip() elimina espacios extra al inicio y al final
# .title() convierte el texto a formato capitalizado, para que coincida con las claves del diccionario
repuesto = input("Ingrese el nombre del repuesto: ").strip().title()

# Solicitar al usuario la cantidad de repuestos que quiere comprar, y convertirla a entero
cantidad = int(input(f"Ingrese la cantidad de {repuesto}: "))

# Verificar si el repuesto existe en el diccionario
if repuesto in repuestos:
    # Calcular el costo total multiplicando el precio unitario por la cantidad solicitada
    total = repuestos[repuesto] * cantidad
    # Mostrar el resultado con dos decimales
    print(f"El costo total de {cantidad} {repuesto}(s) es: {total:.2f} dólares.")
else:
    # Mensaje si el repuesto no está disponible en el diccionario
    print(f"El repuesto '{repuesto}' no está en el diccionario.")
