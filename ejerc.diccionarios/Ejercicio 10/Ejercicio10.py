# Diccionario para almacenar los clientes
# La clave será el NIF (identificación única), y el valor será otro diccionario con los datos del cliente.
clientes = {}

# Bucle infinito para mostrar el menú hasta que el usuario elija terminar
while True:
    # Menú principal
    print("\nMenú de opciones:")
    print("1. Añadir cliente")
    print("2. Eliminar cliente")
    print("3. Mostrar cliente")
    print("4. Listar todos los clientes")
    print("5. Listar clientes preferentes")
    print("6. Terminar")
    
    # Solicitamos al usuario una opción del menú
    opcion = input("Seleccione una opción: ").strip()

    # --- OPCIÓN 1: Añadir cliente ---
    if opcion == "1":
        # Se solicita al usuario la información del cliente
        nif = input("Ingrese el NIF del cliente: ").strip()
        nombre = input("Ingrese el nombre: ").strip()
        direccion = input("Ingrese la dirección: ").strip()
        telefono = input("Ingrese el teléfono: ").strip()
        correo = input("Ingrese el correo: ").strip()
        # Se pregunta si es preferente; si el usuario escribe 's', se guarda como True
        preferente = input("¿Es cliente preferente? (s/n): ").strip().lower() == 's'
        
        # Se guarda el cliente en el diccionario, con un subdiccionario que contiene todos sus datos
        clientes[nif] = {
            "nombre": nombre,
            "direccion": direccion,
            "telefono": telefono,
            "correo": correo,
            "preferente": preferente
        }
        print("Cliente añadido con éxito.")

    # --- OPCIÓN 2: Eliminar cliente ---
    elif opcion == "2":
        # Se pide el NIF del cliente a eliminar
        nif = input("Ingrese el NIF del cliente a eliminar: ").strip()
        # Se verifica si existe el cliente
        if nif in clientes:
            del clientes[nif]  # Eliminamos el cliente del diccionario
            print("Cliente eliminado.")
        else:
            print("Cliente no encontrado.")

    # --- OPCIÓN 3: Mostrar datos de un cliente específico ---
    elif opcion == "3":
        nif = input("Ingrese el NIF del cliente a mostrar: ").strip()
        if nif in clientes:
            # Se muestra el diccionario con los datos del cliente
            print("Datos del cliente:", clientes[nif])
        else:
            print("Cliente no encontrado.")

    # --- OPCIÓN 4: Listar todos los clientes ---
    elif opcion == "4":
        print("\nLista de todos los clientes:")
        # Se recorre el diccionario mostrando el NIF y el nombre de cada cliente
        for nif, datos in clientes.items():
            print(f"NIF: {nif}, Nombre: {datos['nombre']}")

    # --- OPCIÓN 5: Listar clientes preferentes ---
    elif opcion == "5":
        print("\nClientes preferentes:")
        # Se recorre el diccionario filtrando solo aquellos que son preferentes
        for nif, datos in clientes.items():
            if datos['preferente']:
                print(f"NIF: {nif}, Nombre: {datos['nombre']}")

    # --- OPCIÓN 6: Salir del programa ---
    elif opcion == "6":
        print("Programa terminado.")
        break  # Rompe el bucle y finaliza el programa

    # --- OPCIÓN NO VÁLIDA ---
    else:
        print("Opción inválida.")
