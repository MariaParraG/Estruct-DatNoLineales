# Crear un diccionario vacío para almacenar los datos de la persona
persona = {}

# Bucle infinito que se repetirá hasta que el usuario escriba 'salir'
while True:
    # Solicitar el nombre de la clave que se desea agregar al diccionario
    clave = input("Ingrese el nombre del dato (o 'salir' para terminar): ").strip()
    
    # Si el usuario escribe 'salir' (en minúsculas, gracias a .lower()), se termina el ciclo
    if clave.lower() == 'salir':
        break

    # Solicitar el valor para la clave ingresada
    valor = input(f"Ingrese el valor para '{clave}': ").strip()
    
    # Agregar la clave y el valor al diccionario
    persona[clave] = valor
    
    # Mostrar el diccionario actualizado después de cada inserción
    print("\nDiccionario actualizado:")
    print(persona)
