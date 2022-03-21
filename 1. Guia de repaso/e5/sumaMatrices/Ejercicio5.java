package e5.sumaMatrices;

/*Escribir una función que reciba dos matrices de NxN y devuelva la suma de las
mismas. Podemos considerar que las matrices se representan como un arreglo
bidimensional*/

public class Ejercicio5 {
	
	private int[][] m1;
	
	public Ejercicio5(int[][] m1) {
		this.m1 = m1;
	}
	
	
	public int[][] sumaMatrices(int[][] m2) {
		
		int[][] suma = new int[this.m1.length][this.m1.length]; 
		
		for(int i = 0; i < this.m1.length; i++) {
			for(int k = 0; k < this.m1.length; k++) {
				suma[i][k] = this.m1[i][k] + m2[i][k];
			}
		}
		
		return suma;
		
	}
	
	
	public static void main(String[] args) {
		
		
		int matriz1[][] = { {5,6} , {7,8} };
		int matriz2[][] = { {1,1} , {1,1} };
		
		Ejercicio5 instancia1 = new Ejercicio5( matriz1 );
		
		int resultado[][] = instancia1.sumaMatrices(matriz2);
		
		//Para ver la matriz
		for(int i = 0; i < matriz2.length; i++) {
			for(int k = 0; k < matriz2.length; k++) {
				System.out.print(resultado[i][k]);
			}
			System.out.print("\n");
		}
	}
}

