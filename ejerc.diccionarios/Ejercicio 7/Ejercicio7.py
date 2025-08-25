# Crear un diccionario vacío para almacenar los artículos y sus precios
cesta = {}

# Bucle infinito para permitir al usuario ingresar varios artículos
while True:
    # Pedir el nombre del artículo
    articulo = input("Ingrese el artículo (o 'salir' para terminar): ").strip()
    
    # Si el usuario escribe 'salir', se detiene el bucle
    if articulo.lower() == 'salir':
        break
    
    # Pedir el precio del artículo y convertirlo a número decimal (float)
    precio = float(input(f"Ingrese el precio de {articulo}: "))
    
    # Guardar el artículo y su precio en el diccionario
    cesta[articulo] = precio

# Mostrar la lista de compra
print("\nLista de la compra")
total = 0  # Variable para acumular el total de la compra
for articulo, precio in cesta.items():
    # Mostrar el artículo y su precio con dos decimales
    print(f"{articulo}: {precio:.2f}")
    total += precio  # Sumar el precio al total

# Mostrar el total de la compra con dos decimales
print(f"\nTotal de la compra: {total:.2f}")
