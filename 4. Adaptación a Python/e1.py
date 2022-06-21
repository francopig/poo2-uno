#.1- Escribir una función que reciba un número n y devuelva true si n es primo.
import math

def es_primo(n):
    if(n == 1):
      return False

    # La condición del for es equivalente a range(1, n) pero más óptima
    for i in range(2, int(n/2)+1 ):
        if( n % i == 0 ): 
            return False
        
    return True


print("Ingresar un número para averiguar si es primo: ")
numero_ingresado = int( input() )
print(   "Resultado: ", es_primo( numero_ingresado ) )

#Primos entre 1 y 100
# for i in range(1,100):
#     if( es_primo(i) ):
#         print( f"{i}: es primo" )