# Diccionario que relaciona los números de mes (en formato '01', '02', etc.)
# con su nombre correspondiente en español
meses = {
    '01': 'enero',
    '02': 'febrero',
    '03': 'marzo',
    '04': 'abril',
    '05': 'mayo',
    '06': 'junio',
    '07': 'julio',
    '08': 'agosto',
    '09': 'septiembre',
    '10': 'octubre',
    '11': 'noviembre',
    '12': 'diciembre'
}

# Solicitar al usuario que ingrese una fecha en formato dd/mm/aaaa
# .strip() elimina espacios en blanco al inicio y final
fecha = input("Ingrese una fecha (dd/mm/aaaa): ").strip()

# Dividir la fecha en tres partes: día, mes y año
# split('/') separa el texto usando el carácter '/' como delimitador
dia, mes, anio = fecha.split('/')

# Verificar si el mes ingresado existe en el diccionario
if mes in meses:
    # Mostrar la fecha con el nombre del mes
    # int(dia) convierte el día en número entero para evitar ceros a la izquierda
    print(f"{int(dia)} de {meses[mes]} de {anio}")
else:
    # Mensaje de error si el mes no es válido
    print("El mes ingresado no es válido.")
