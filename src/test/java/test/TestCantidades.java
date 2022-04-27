package test;

import gestion.Zona;
import gestion.Zoologico;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import test.zooAnimales.Pez;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestCantidades {
	
	public static Zoologico zoo = new Zoologico();
	
	static {
		Zona z1 = new Zona();
		Zona z2 = new Zona();
		zoo.agregarZonas(z1);
		zoo.agregarZonas(z2);
		z1.agregarAnimales(test.zooAnimales.Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(test.zooAnimales.Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(test.zooAnimales.Mamifero.crearLeon("test", 11, "M"));
		z1.agregarAnimales(test.zooAnimales.Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(test.zooAnimales.Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(test.zooAnimales.Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(test.zooAnimales.Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(test.zooAnimales.Anfibio.crearRana("test", 11, "M"));
		z2.agregarAnimales(test.zooAnimales.Anfibio.crearSalamandra("test", 11, "M"));
		z2.agregarAnimales(test.zooAnimales.Reptil.crearIguana("test", 11, "M"));
		z2.agregarAnimales(test.zooAnimales.Reptil.crearSerpiente("test", 11, "M"));
		z2.agregarAnimales(test.zooAnimales.Pez.crearSalmon("test", 11, "M"));
		z2.agregarAnimales(test.zooAnimales.Pez.crearBacalao("test", 11, "M"));
		test.zooAnimales.Mamifero.crearCaballo("test", 11, "M");
		test.zooAnimales.Ave.crearHalcon("test", 11, "M");
		test.zooAnimales.Anfibio.crearRana("test", 11, "M");
		test.zooAnimales.Reptil.crearIguana("test", 11, "M");
		test.zooAnimales.Pez.crearBacalao("test", 11, "M");
	}
	
	@Test
   	public void testCantidadTotalAnimales(){
		assertEquals(zoo.cantidadTotalAnimales(), 13, "Hay un problema en el metodo de cantidadTotalAnimales en la clase Gestion.Zoologico");
    }
	
	@Test
   	public void testCantidadAnimalesZonas(){
		assertEquals(zoo.getZona().get(0).cantidadAnimales(), 8, "Hay un problema en el metodo de cantidadAnimales en la clase Gestion.Zona");
    }
	
	@Test
   	public void testCantidadMamiferos(){
		boolean ok = false;
		
		if(test.zooAnimales.Mamifero.caballos == 3 && test.zooAnimales.Mamifero.leones == 1) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un problema con el conteo de caballos o leones");
    }
	
	@Test
   	public void testCantidadAves(){
		boolean ok = false;
		
		if(test.zooAnimales.Ave.aguilas == 2 && test.zooAnimales.Ave.halcones == 3) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un problema con el conteo de aguilas o halcones");
    }
	
	@Test
   	public void testCantidadAnfibios(){
		
		boolean ok = false;
		
		if(test.zooAnimales.Anfibio.ranas == 2 && test.zooAnimales.Anfibio.salamandras == 1) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un problema con el conteo de ranas o salamandras");
    }
	
	@Test
   	public void testCantidadReptiles(){
		
		boolean ok = false;
		
		if(test.zooAnimales.Reptil.iguanas == 2 && test.zooAnimales.Reptil.serpientes == 1) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un problema con el conteo de iguanas o serpientes");
    }
	
	@Test
   	public void testCantidadPeces(){
		
		boolean ok = false;
		
		if(test.zooAnimales.Pez.salmones == 1 && Pez.bacalaos == 2) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un problema con el conteo de salmones o bacalaos");
    }
}
