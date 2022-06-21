#Algoritmo iterativo para calcular la secuencia de Fibonacci

def fibonacci_de(n):

    a = 0
    b = 1

    for i in range(n):
        acumulador = a + b 
        a = b
        b = acumulador

    return b


for i in range(10):
    print(f"Elemento {i} = { fibonacci_de(i) }")
