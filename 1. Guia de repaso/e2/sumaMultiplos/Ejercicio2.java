package e2.sumaMultiplos;


/*	 2. Escribir una función que calcule la suma de los múltiplos de 3 y 5, mayores o
		iguales que 0 y menores que un parámetro n. Por ejemplo la llamada:
		sumaMultiplos(10); // devuelve 23 (3+5+6+9)
		sumaMultiplos(16); // devuelve 60 (3+5+6+9+10+12+15)
 * */

public class Ejercicio2 {
	
	int numero;

	public Ejercicio2(int numero) {
		this.numero = numero;
	}
	
	public int sumaDeMultiplos() {
		int suma = 0;
		
		for(int i = 1; i < numero; i++) {
			if((i % 3 == 0) || (i % 5 == 0)) {
				suma += i;
				System.out.println("acumulador: " + suma  );
			}
		}
		
		return suma;
	}
	
	public static void main(String[] args) {
		
		Ejercicio2 instancia1 = new Ejercicio2(1);
		Ejercicio2 instancia2 = new Ejercicio2(5);
		Ejercicio2 instancia3 = new Ejercicio2(9);
		Ejercicio2 instancia4 = new Ejercicio2(10);
		Ejercicio2 instancia5 = new Ejercicio2(16);
		
		System.out.println(instancia1.sumaDeMultiplos()); //0
		System.out.println("-------");
		System.out.println(instancia2.sumaDeMultiplos()); //3
		System.out.println("-------");
		System.out.println(instancia3.sumaDeMultiplos()); //14
		System.out.println("-------");
		System.out.println(instancia4.sumaDeMultiplos()); //23
		System.out.println("-------");
		System.out.println(instancia5.sumaDeMultiplos()); //60
		
	}
}
