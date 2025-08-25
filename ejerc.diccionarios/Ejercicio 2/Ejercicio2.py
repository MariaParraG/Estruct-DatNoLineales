# Crear diccionario vacío para almacenar los datos del usuario
usuario = {}

# Solicitar datos al usuario y guardarlos en el diccionario
# .strip() elimina espacios en blanco al inicio y final de cada entrada
usuario['nombre'] = input("Ingrese su nombre: ").strip()
usuario['edad'] = input("Ingrese su edad: ").strip()
usuario['direccion'] = input("Ingrese su dirección: ").strip()
usuario['telefono'] = input("Ingrese su número de teléfono: ").strip()

# Mostrar mensaje con los datos ingresados usando formato f-string
print(f"{usuario['nombre']} tiene {usuario['edad']} años, vive en {usuario['direccion']} y su número de teléfono es {usuario['telefono']}.")
