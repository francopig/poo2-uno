#Algoritmo para calcular la secuencia de Fibonacci con listas

def fibonacci(n):

    if( n == 1 ):
        return [0]

    if( n == 2 ):
        return [0,1]

    sucesion = [0, 1]
    anterior = sucesion[0]
    actual = sucesion[1]

    for i in range(1, n-1):

        sucesion.append( anterior + actual )
        anterior = sucesion[i]
        actual = sucesion[i+1]

        # Se puede realizar sin variables así:
        # sucesion.append( sucesion[i-1] + sucesion[1] )
    
    return sucesion


print("ingresar un numero para mostrar los primeros N números de la secuencia: ")
entrada = int ( input() )
print(fibonacci(entrada))



