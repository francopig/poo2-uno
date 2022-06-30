import googletrans 
from googletrans import Translator
import os #pa limpiar la pantalla

traductor = Translator()

niveles = [  ["hola", "perro", "gato", "gordo", "chau"] \
            ,["escoba" , "madera", "microfono", "espejo"] \
            ,["perserverancia", "inverosimil", "virulana", "cantimplora", "Caleidoscopio"]]

# nivel 1 = niveles[0]
# nivel 2 = niveles[1]
# nivel 3 = niveles[2]

def jugar (nivel_elegido):

    global puntaje 

    print(f"# Nivel elegido: {nivel_elegido}")
    for palabra in niveles[nivel_elegido - 1]:
        print(f"¿Cómo se dice { palabra } en inglés:")
        entrada = input()
        respuesta_correcta = traductor.translate(palabra, "en","es").text
        if ( entrada.lower() == respuesta_correcta.lower() ):
            print("acertaste!")
            puntaje = puntaje + nivel_elegido
        else: 
            print(f"Mal, respuesta correcta: {respuesta_correcta} ")


print(" -- El juego comienza -- ")
puntaje = 0
jugar(1)
jugar(2)
os.system("cls")
jugar(2)

print(f"puntaje final: {puntaje}")