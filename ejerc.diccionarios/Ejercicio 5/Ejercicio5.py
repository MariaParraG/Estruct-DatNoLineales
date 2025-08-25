# Diccionario con asignaturas y sus respectivos créditos
# Cada clave es el nombre de la asignatura y el valor, el número de créditos
asignaturas = {'Matemáticas': 6, 'Física': 4, 'Química': 5}

# Recorrer el diccionario para mostrar cada asignatura con su número de créditos
for asignatura, creditos in asignaturas.items():
    print(f"{asignatura} tiene {creditos} créditos")

# Calcular el total de créditos sumando todos los valores del diccionario
total_creditos = sum(asignaturas.values())

# Mostrar el total de créditos del curso
print(f"El número total de créditos del curso es: {total_creditos}")
