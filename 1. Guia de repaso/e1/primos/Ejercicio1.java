package e1.primos;

/*Escribir una función que reciba un número n y devuelva true si n es primo o false
en caso contrario*/

public class Ejercicio1 {
	
	int numero;
	
	public Ejercicio1(int numero) {
		this.numero = numero;
	}
	
	public boolean esPrimo(){
		
		for(int i = 2; i <= numero/2; i++ ) {
			if(numero % i == 0) return false;
		}
		return true;	
	}
	
	public static void main(String[] args) {
		
		Ejercicio1 instancia1 = new Ejercicio1(9);
		Ejercicio1 instancia2 = new Ejercicio1(17);
		Ejercicio1 instancia3 = new Ejercicio1(18);
		Ejercicio1 instancia4 = new Ejercicio1(19);
		
		System.out.println(instancia1.esPrimo()); //false
		System.out.println(instancia2.esPrimo()); //true
		System.out.println(instancia3.esPrimo()); //false
		System.out.println(instancia4.esPrimo()); //true
		
	}

}
