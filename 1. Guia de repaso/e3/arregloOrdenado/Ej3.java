package e3.arregloOrdenado;

/*Escribir una función que reciba un arreglo de enteros y devuelva true si el arreglo
está ordenado de mayor a menor y false si está desordenado.*/

public class Ej3 {

	int arr[];
	
	public Ej3(int[] arr) {
		this.arr = arr;
	}
	
	
	public boolean estaOrdenado() {
		
		//Recorre hasta la longitud-1 porque el ultimo no se compara con un próximo
		//A demás se saldría de rango
		for(int i = 0; i < this.arr.length-1; i++) {
			if(this.arr[i] > this.arr[i+1]) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int arreglo1[] = {1,2,3,4,5};
		int arreglo2[] = {1,2,4,3,5};
		
		Ej3 instancia1 = new Ej3 (arreglo1);
		Ej3 instancia2 = new Ej3 (arreglo2);
		
		System.out.println("Instancia 1 esta ordenado:" + instancia1.estaOrdenado()); //true
		System.out.println("Instancia 2 esta ordenado:" + instancia2.estaOrdenado()); //false
		
		
	}
}
