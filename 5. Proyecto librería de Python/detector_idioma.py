#Mini programa: traduce mensajes de cualquier idioma al español

import googletrans 
from googletrans import Translator

translator = Translator()

# idioma tiene que tener el formato "en", "it" y asi...
def traducir(entrada):
    return (translator.translate(entrada, "es").text )


print("ingresar frase a detectar: ")
entrada = input()
#entrada = "привет из россии"
print("Ingresar idioma de destino con formato de 2 letras")
idioma = input()

print(f"resultado: { traducir( entrada ) } ")    