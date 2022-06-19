import networkx as nx
import matplotlib.pyplot as plt

class El_Grafo:

    vertices = []
    aristas  = []
    distancia = 0
    vector_de_calles_cambiables = []
    
    Grafo = nx.Graph()

    def __init__(self):
        pass

    #Método para validar que el parámetro se encuentre dentro de un rango
    #en caso de que esté por fuera lo cambia a su extremo correspondiente. :)
    def validar(self, n, min, max): 
        if(n > max):
            n = max
     
        if(n < min):
            n = min
        
        return n
        
    def cargar_datos(self):
        
        archivo = open("entrada.in")
        contador = 0
    
        for linea in archivo:

            if (contador == 0): #primera linea (esquinas-pos_colectivo-pos_escuela)
                datos = linea.split(" ")

                datos[0] = self.validar( int(datos[0]), 1, 80000)

                for dato in range(0, int(datos[0]) ) :
                    self.vertices.append( str( dato + 1) )
                
                #Auxiliar para trabajar con el subindice 
                aux1 = int( datos[1] ) -1  
                aux2 = int( datos[2] ) -1
                self.colectivo = self.vertices[aux1] 
                self.colegio   = self.vertices[aux2]  
                contador += 1
                continue
                       
            if (contador == 1): #Segunda linea (numero_calles)
                total_calles = linea.split(" ")
                total_calles[0] = self.validar( int(total_calles[0]), 1, 250000)
                contador += 1
                continue  

            else: #todas las demás lineas (esq_salida; esq_llegada; peso)
                calle = linea.split(" ")
                calle[2] = self.validar( int(calle[2]), 1, 50) ## validamos los decámetros
                self.aristas.append( (calle[0], calle[1], int( calle[2] ) ) )
                pass

    def fabricar_grafo( self ):
        self.Grafo.add_nodes_from( self.vertices )
        self.Grafo.add_weighted_edges_from( self.aristas )
        self.dijkstra = nx.dijkstra_path( self.Grafo, self.colectivo, self.colegio )
        self.distancia = nx.dijkstra_path_length( self.Grafo, self.colectivo, self.colegio ) #* se guarda el costo de dikjstra
        nx.draw( self.Grafo, pos=nx.circular_layout( self.Grafo ), node_color='r', edge_color='g', with_labels=True )
        plt.show()

    def buscar_cambios_de_calle( self ):

        numerito_de_calle = 1
        for arista in self.aristas:
           
            calle_girada = (arista[1], arista[0])

            for i in range (1, len(self.dijkstra)):
                if ( ( calle_girada[0] == self.dijkstra[i-1] ) and ( calle_girada[1] == self.dijkstra[i]) ):
                    self.vector_de_calles_cambiables.append(numerito_de_calle)

            numerito_de_calle += 1
        
    def recorrido_del_grafo( self ):
        print("Dijkstra: ", nx.dijkstra_path( self.Grafo, self.colectivo, self.colegio )) 

    def crear_archivo_salida( self ):
        archivo = open("salida.out", "w")
        archivo.write( str( self.distancia ) + "\n" )
        for calle in self.vector_de_calles_cambiables:
            archivo.write(str ( calle ) + " ")
        archivo.close()


grafo1 = El_Grafo()
## Llamado a métodos
grafo1.cargar_datos()
grafo1.fabricar_grafo()
grafo1.recorrido_del_grafo()
grafo1.buscar_cambios_de_calle()
grafo1.crear_archivo_salida()