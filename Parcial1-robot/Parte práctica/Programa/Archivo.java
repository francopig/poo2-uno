package parcial1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	private File archivo;
	public String[] datos = {};
	public String instrucciones;
	public int X;
	public int Y;
	public Cardinal S;
	public int M;
	public int N;

	public void leedor(String archivoEntrada, String archivoSalida) throws IOException {

		try {
			archivo = new File("src/parcial1/" + archivoEntrada);
			Scanner sc = new Scanner(archivo);
			datos = sc.nextLine().split(" ");
			instrucciones = sc.nextLine();

			if(Integer.parseInt(datos[0])>0 && Integer.parseInt(datos[0])<100) {
				X = Integer.parseInt(datos[0]);
			}
			if(Integer.parseInt(datos[1])>0 && Integer.parseInt(datos[1])<100) {
				Y = Integer.parseInt(datos[1]);
			}
			S = (datos[2].charAt(0) == 'N') ? Cardinal.NORTE :
				(datos[2].charAt(0) == 'E') ? Cardinal.ESTE  :
				(datos[2].charAt(0) == 'S') ? Cardinal.SUR   :  Cardinal.OESTE ;
			N = Integer.parseInt(datos[3]);
			M = Integer.parseInt(datos[4]);
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new Error("ERROR el archivo no existe");
		}
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public Cardinal getS() {
		return S;
	}

	public int getM() {
		return M;
	}

	public int getN() {
		return N;
	}


	public void escribir(Robot robotito) throws IOException{
		
		try {
		
			FileWriter archivo = new FileWriter("src/parcial1/ROBOT.out");
			PrintWriter salida = new PrintWriter(archivo);
			BufferedWriter bw = new BufferedWriter(salida);

			bw.write(robotito.getFila() + " " + robotito.getColumna());

			bw.close();
		}catch (IOException e) {
			e.printStackTrace();
			throw new Error("ERROR");
		}
	}

}
