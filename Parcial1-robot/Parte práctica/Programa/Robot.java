package parcial1;

public class Robot {

	int fila;
	int columna;
	Cardinal orientacion;
	Cuadricula cuadricula;
	
	
	public Robot(int X, int Y, Cardinal S, Cuadricula cuadricula) {
		
		this.fila = Y;
		this.columna = X;
		this.orientacion = S;
		this.cuadricula = cuadricula;
	}

	//Getter y setters

	public Cardinal getOrientacion() {
		return orientacion;
	}
	
	public void setOrientacion(Cardinal orientacion) {
		this.orientacion = orientacion;
	}

	public int getColumna() {
		return this.columna;
	}

	public int getFila() {
		return this.fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

// Metodos 

	public int deCardinalAInt(Cardinal orientacion) {
		int orientacionNumerica = (orientacion == Cardinal.NORTE) ? 0 :
								  (orientacion == Cardinal.ESTE)  ? 1 :
								  (orientacion == Cardinal.SUR)   ? 2 : 3;
		return orientacionNumerica;
	}
	
	public Cardinal deIntACardinal (int orientacioNumerica) {
		Cardinal orientacionCardinal = (orientacioNumerica == 0) ? Cardinal.NORTE :
									   (orientacioNumerica == 1) ? Cardinal.ESTE  :
									   (orientacioNumerica == 2) ? Cardinal.SUR   : Cardinal.OESTE;
									
		
		return orientacionCardinal;
	}
	
	/** @param: instrucciones = string con todas los comandos, cada comando tiene 2 caracteres 
	   Este método es el punto de partida de los 2 métodos principales */
	public void obedecer(String instrucciones) {
		
		
		//El for avanza de a 2 para leer el caracter del tipo de instrucción
		//Itera hasta el 250 porque la consigna limita a 125 comandos (125*2 = 250)
		//La comparación tiene que ser si o si en char, por eso la conversión
		for (int i=0; i<instrucciones.length() && i<250; i+=2) {
			
			if(instrucciones.charAt(i) == 'A') {
				this.avanzar(Character.getNumericValue(instrucciones.charAt(i+1)));
			}
			
			if(instrucciones.charAt(i) == 'R') {
				this.girar(Character.getNumericValue(instrucciones.charAt(i+1)));
			}
		}
	}
	
	/** @param: cantidad = cantidad de pasos por avanzar
	* No existe desbordamiento, se limita en los bordes */
	public void avanzar(int cantidad){
		
		//1. obtener posicion y orientacion del robot,también cant maxima de filas y columnas del mapa
		int posicionX = this.fila;
		int posicionY = this.columna;
		Cardinal orientacionActual = this.orientacion;
		 
		int cantMaximaColumnas = this.cuadricula.getCantColumnas();
		int cantMaximaFilas = this.cuadricula.getCantFilas();

		
		//2. Calcular casilleros disponibles para avanzar y actualizar posición
		
		 int cantFilasDisponibles;//    = cantMaximaFilas - posicionX;
		 int cantColumnasDisponibles;// = cantMaximaColumnas - posicionY;
		 
		 /*El calculo de filas o columnas disponibles varia dependiendo la orientacion*/
		switch(orientacionActual) {
			case NORTE: 
				cantFilasDisponibles = cantMaximaFilas  - posicionX;
				
				if(cantidad >= cantFilasDisponibles) {
					setFila(cantMaximaFilas);
				}else {
					setFila(posicionX + cantidad);
				}
				break;
				
			case SUR:
				cantFilasDisponibles = posicionX - 1; //-1 porque estoy pisando una
				
				if(cantidad >= cantFilasDisponibles) {
					setFila(1);
				}else {
					setFila(posicionX - cantidad);
				}
				break;
				
				
			case OESTE:
				cantColumnasDisponibles = cantMaximaColumnas - posicionY;
				
				if(cantidad >= cantColumnasDisponibles) {
					setColumna(cantMaximaColumnas);
				}else {
					setColumna(posicionY + cantidad);
				}
				break;
		
			case ESTE:
				cantColumnasDisponibles = posicionY - 1;
	
				if(cantidad >= cantColumnasDisponibles) {
					setColumna(1);
				}else {
					setColumna(posicionY - cantidad);
				}
				break;
		}
		
	}
	
	

	
	public void girar(int cantidadGiros) {
		
				//1. obtener orientación actual y le asignamos un número
				Cardinal orientacion = this.getOrientacion();
				int orientacionNumerica = this.deCardinalAInt(orientacion);
				
				//2. Calculamos giro y almacenamos la nueva orientación
				int orientacionNuevaNumerica = (orientacionNumerica + cantidadGiros) % 4;
				
			
				
				//3. Desciframos la orientación de numero a punto cardinal
				Cardinal orientacionNueva = this.deIntACardinal(orientacionNuevaNumerica);
				
				//4. Actualizamos la orientacion
				this.setOrientacion(orientacionNueva);
		
			}		
		
}
