import googletrans 
from googletrans import Translator

translator = Translator()

# idioma tiene que tener el formato "en", "it" y asi
def traducir(entrada, idioma):
    return (translator.translate(entrada, idioma, "es").text )



print("ingresar frase a traducir: ")
entrada1 = input()

print("Ingresar idioma de destino con formato de 2 letras")
idioma = input()
print(f"resultado: { traducir( entrada1, idioma)} ")

