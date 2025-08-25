# Solicitar lista de traducciones en formato "español:inglés" separadas por comas
entrada = input("Ingrese palabras en formato español:inglés separadas por comas: ")

# Crear un diccionario vacío para almacenar las traducciones
diccionario = {}

# Procesar cada par de palabras separado por comas
for par in entrada.split(","):
    # Dividir cada par en español e inglés usando el carácter ":"
    esp, ing = par.strip().split(":")
    # Guardar la traducción en el diccionario, eliminando espacios innecesarios
    diccionario[esp.strip()] = ing.strip()

# Solicitar al usuario una frase en español
frase = input("Ingrese una frase en español: ")

# Lista para ir guardando las palabras traducidas
traduccion = []

# Traducir palabra por palabra
for palabra in frase.split():
    # Usar .get() para obtener la traducción si existe, o dejar la palabra igual si no está en el diccionario
    traduccion.append(diccionario.get(palabra, palabra))

# Mostrar el resultado uniendo las palabras traducidas con espacios
print("Frase traducida:", " ".join(traduccion))
