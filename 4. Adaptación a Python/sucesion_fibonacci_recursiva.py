#Algoritmo para calcular la secuencia de Fibonacci con recursión o_o


def calcular_fibonacci(n):

    #caso base
    if( n < 2 ):
        return n

    # Un elemento n está definido por la suma de su anterior y su trasanterior
    return calcular_fibonacci(n-1) + calcular_fibonacci(n-2)


for i in range(15):
    print(f"Elemento {i} = { calcular_fibonacci(i) }")