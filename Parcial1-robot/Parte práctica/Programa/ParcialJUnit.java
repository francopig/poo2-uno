package parcial1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParcialJUnit {

	Archivo arch;
	Cuadricula tab; 
	Robot rob; 
	
	@Before
	public void setUp() throws Exception {
		 arch = new Archivo();
		 tab = new Cuadricula(10, 11);
		 rob = new Robot(3, 5, Cardinal.NORTE, tab);	 
	}

	@Test
	
	public void archivoNotNullTest() {
		assertNotNull (arch);
	}
	
	@Test
	public void cuadriculaNotNullTest() {
		assertNotNull (tab);
	}
	
	@Test
	public void robotNotNullTest() {
		
		assertNotNull (rob);
	}

	@Test
	public void orientacionTest() {
		
		Cardinal esperado = Cardinal.NORTE;
		Cardinal obtenido = rob.getOrientacion();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void posicionXTest() {
		
		int esperado = 3;
		int obtenido = rob.getColumna();
		
		assertEquals(esperado, obtenido);
	}

	@Test
	public void posicionYTest() {
		int esperado = 5;
		int obtenido = rob.getFila();
		
		assertEquals(esperado, obtenido);
	}

	@Test
	public void deCardinalAIntTest() {
		
		int esperado = 1;
		
		int obtenido = rob.deCardinalAInt(Cardinal.ESTE);
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void deIntACardinalTest() {
		
		Cardinal esperado = Cardinal.OESTE;
		
		Cardinal obtenido = rob.deIntACardinal(3);
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void movimientoNorteTest() {
		
		int esperado = 9;
		
		rob.avanzar(4);//5+4=9
		int obtenido = rob.getFila();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void movimientoLimiteNorteTest() {
		
		int esperado = 10;
		
		rob.avanzar(9);//Se detiene en el borde
		int obtenido = rob.getFila();
		
		assertEquals(esperado, obtenido);
	}

	@Test
	public void movimientoSurTest() {
		
		rob.setOrientacion(Cardinal.SUR);
		int esperado = 4;
		
		rob.avanzar(1);//5-1=4
		int obtenido = rob.getFila();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void movimientoLimiteSurTest() {
		
		rob.setOrientacion(Cardinal.SUR);
		int esperado = 1;
		
		rob.avanzar(9);//Se detiene en el borde
		int obtenido = rob.getFila();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void movimientoEsteTest() {
		
		rob.setOrientacion(Cardinal.ESTE);
		int esperado = 2;
		
		rob.avanzar(1);//3-1=2
		int obtenido = rob.getColumna();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void movimientoLimiteEsteTest() {
		
		rob.setOrientacion(Cardinal.ESTE);
		int esperado = 1;
		
		rob.avanzar(9);//Se detiene en el borde
		int obtenido = rob.getColumna();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void movimientoOesteTest() {
		
		rob.setOrientacion(Cardinal.OESTE);
		int esperado = 5;
		
		rob.avanzar(2);//3+2=5
		int obtenido = rob.getColumna();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void movimientoLimiteOesteTest() {
		
		rob.setOrientacion(Cardinal.OESTE);
		int esperado = 11;
		
		rob.avanzar(9);//Se detiene en el borde
		int obtenido = rob.getColumna();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	
	public void girar_0_veces_test() {
		Cardinal esperado = Cardinal.NORTE;
		rob.girar(0);
		Cardinal obtenido = rob.getOrientacion();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void girar_9_veces_test() {
		Cardinal esperado = Cardinal.ESTE;
		rob.girar(9);
		Cardinal obtenido = rob.getOrientacion();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void obedecerGiroTest() {
		Cardinal esperado = Cardinal.OESTE;
		rob.obedecer("R3A2");
		Cardinal obtenido = rob.getOrientacion();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void obedecerAvanzarTest() {
		int esperado = 5;
		rob.obedecer("R3A2");
		int obtenido = rob.getColumna();
		
		assertEquals(esperado, obtenido);
	}
}
