'''
3. Escribir una función que reciba un arreglo de enteros y devuelva true si el arreglo
está ordenado de mayor a menor y false si está desordenado
'''

def esta_ordenado(array):
    for i in range(0, len(array)-1 ):
        if( array[i] > array[i+1] ):
                print(f"array[{i}] es mayor a array[{i+1}]")
                return False

    return True


arreglo1 = [1,2,3,4,5]
arreglo2 = [2,4,5,1,6]

print("Arreglo1 está ordenado: ", esta_ordenado(arreglo1))
print("Arreglo2 está ordenado: ", esta_ordenado(arreglo2))



