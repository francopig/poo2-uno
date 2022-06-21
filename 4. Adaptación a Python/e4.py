'''
4. Escribir una función que reciba un arreglo de enteros y devuelva la suma de los
elementos que se encuentran en posiciones pares (incluido el elemento de la
posición 0). Por ejemplo:
'''

def suma_pares(array):
    acumulador = array[0]
    for i in range(0, len(array)):
        if((i % 2) == 0):
            acumulador += array[i]

    return acumulador


arreglo1 = [1,2,3,4,5,6,7,8,9,10]
arreglo2 = [10,20,30,50,100,1000]

print("La suma de los indices pares del arreglo 1 es : ", suma_pares(arreglo1));
print("La suma de los indices pares del arreglo 2 es : ", suma_pares(arreglo2));