'''
5. Escribir una función que reciba dos matrices de NxN y devuelva la suma de las
mismas. Podemos considerar que las matrices se representan como un arreglo
bidimensional.
'''

def sumar_matrices(m1, m2):
    # Se puede agregar una funcion extra para comprobar que tengan el mismo orden
    if( (len(m1) == len(m2) ) and (len(m1[0]) == len(m2[0]) ) ):

        suma = []
        for i in range(0, len(m1)):
            suma.append([])
            for k in range(0, len(m2)):
                suma[i].append( m1[i][k] + m2[i][k] )

    else: 
        return -1
        
    return suma


matriz1 = [[1,2,3], [4,5,6], [7,8,9]]
matriz2 = [[2,4,6], [8,10,12], [14, 16, 18]]

print(f"El resultado de sumar la matriz 1 y 2 es: ", sumar_matrices(matriz1, matriz2))

