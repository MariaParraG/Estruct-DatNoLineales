# Diccionario para facturas
facturas = {}  # Se usará para almacenar las facturas en formato {numero: costo}
cobrado = 0.0  # Total de dinero ya cobrado

while True:
    # Mostrar menú y leer opción
    opcion = input("\nSeleccione una opción: [A]ñadir, [P]agar, [T]erminar: ").strip().upper()

    if opcion == 'A':  # Añadir una nueva factura
        numero = input("Ingrese el número de factura: ").strip()  # Número de factura
        costo = float(input("Ingrese el costo de la factura: "))  # Costo de la factura
        facturas[numero] = costo  # Se almacena en el diccionario
        print(f"Factura {numero} añadida.")  # Confirmación al usuario

    elif opcion == 'P':  # Pagar una factura existente
        numero = input("Ingrese el número de factura a pagar: ").strip()
        if numero in facturas:
            cobrado += facturas.pop(numero)  # Sumar al total cobrado y eliminar de pendientes
            print(f"Factura {numero} pagada.")
        else:
            print("Factura no encontrada.")  # Aviso si no existe la factura

    elif opcion == 'T':  # Terminar el programa
        break  # Salir del bucle

    else:
        # Opción no reconocida
        print("Opción no válida.")

    # Mostrar resumen de los totales
    pendiente = sum(facturas.values())  # Sumar el valor de todas las facturas pendientes
    print(f"Total cobrado: {cobrado:.2f} | Total pendiente: {pendiente:.2f}")
