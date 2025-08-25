# Cadena de ejemplo con los datos de los clientes
# Cada cliente tiene: cédula, nombre, email, teléfono y descuento, separados por ';'
# Cada cliente está separado por un salto de línea '\n'
datos = "cedula;nombre;email;telefono;descuento\n1001234567;Luis Gonzalez;luisgonzalez@mail.com;656343576;12.5\n1009876543;Maria Perez;maria@mail.com;3123456789;15"

# Separa el texto completo en una lista de líneas
# Cada línea representará un cliente o los encabezados
lineas = datos.split('\n')

# Toma la primera línea de la lista (encabezados) y la separa por ';'
# Esto nos da una lista con los nombres de cada campo
encabezados = lineas[0].split(';')

# Crea un diccionario vacío para almacenar la información de los clientes
clientes = {}

# Recorre las líneas desde la segunda en adelante (los datos de cada cliente)
for linea in lineas[1:]:
    # Divide la línea actual en campos usando ';' como separador
    campos = linea.split(';')
    
    # Usa la cédula como clave principal del diccionario
    cedula = campos[0]
    
    # Crea un subdiccionario para almacenar los demás datos del cliente
    clientes[cedula] = {
        encabezados[1]: campos[1],  # nombre
        encabezados[2]: campos[2],  # email
        encabezados[3]: campos[3],  # teléfono
        encabezados[4]: campos[4]   # descuento
    }

# Recorre el diccionario final e imprime la información de cada cliente
for cedula, info in clientes.items():
    print(f"Cédula: {cedula}, Datos: {info}")
