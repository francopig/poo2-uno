package e5b.calcularTraza;

/*Ejercicio nuevo: calcular traza de una matriz*/

public class EjNuevo {

	private int m1[][];

	public EjNuevo(int orden) {
		m1 = new int [orden][orden];
		cargarMatriz();
	}


	public int calcularTraza() {
		int traza = 0;
	
		for(int i = 0; i < m1.length; i++) {
			traza += m1[i][i];	
		}

		return traza;
	}


	//carga la matriz con numeros aleatorios y la muestra de paso
	public void cargarMatriz(){
		for (int i = 0; i < m1.length; i++) {
			for(int k = 0; k < m1.length; k++) {
				this.m1[i][k] = (int) (Math.random() * 10); //RANDOM 1 - 9
				System.out.print(m1[i][k] + " ");
			}
		System.out.print("\n");
		}
	}


	public static void main(String[] args) {

	EjNuevo instancia1 = new EjNuevo(4);
	System.out.println("traza: " + instancia1.calcularTraza());
	}
	

}
