package parcial1;

import java.io.IOException;

public class ParcialMain {
	public static void main(String[] args) throws IOException {
		Archivo archivito = new Archivo();
		archivito.leedor("ROBOT.in", "ROBOT.out");
		
		Cuadricula tablero = new Cuadricula(archivito.getM(), archivito.getN());
		Robot robotino = new Robot(archivito.getX(), archivito.getY(), archivito.getS(), tablero);
		
		robotino.obedecer(archivito.getInstrucciones());
		
		archivito.escribir(robotino);
		
		System.out.println(robotino.getFila() + "  " + robotino.getColumna() + "  " + robotino.getOrientacion());
		System.out.println("La matriz es de filas: "+ tablero.getCantFilas() + " y columnas: " + tablero.getCantColumnas());

	}
	
}
