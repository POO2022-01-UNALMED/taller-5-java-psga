package test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import test.zooAnimales.Pez;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestRetornos {

	@Test
   	public void testTotalTipo(){
		
		new test.zooAnimales.Anfibio();
		new test.zooAnimales.Anfibio();
		new test.zooAnimales.Mamifero();
		new test.zooAnimales.Mamifero();
		new test.zooAnimales.Mamifero();
		new test.zooAnimales.Reptil();
		new test.zooAnimales.Pez();
		new test.zooAnimales.Ave();
		new test.zooAnimales.Ave();
		boolean ok = false;
		String  comp = "Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3";
		if(test.zooAnimales.Animal.totalPorTipo().equals(comp)) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un problema en el metodo totalPorTipos");
    }
	
	@Test
   	public void testToString(){
		
		test.zooAnimales.Ave an2 = new test.zooAnimales.Ave("paloma", 5, "ciudad", "F", "gris");
		boolean ok = false;
		String  comp = "Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F";
		if(an2.toString().equals(comp)) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un problema en el metodo toString de la clase zooAnimales.Animal");
    }
	
	@Test
   	public void testMovimiento(){
		
		test.zooAnimales.Animal a1 = new test.zooAnimales.Anfibio();
		test.zooAnimales.Animal a2 = new test.zooAnimales.Ave();
		test.zooAnimales.Animal a3 = new test.zooAnimales.Mamifero();
		test.zooAnimales.Animal a4 = new Pez();
		test.zooAnimales.Animal a5 = new test.zooAnimales.Reptil();
		boolean ok = false;
		if(a1.movimiento().equals("saltar") && a2.movimiento().equals("volar")
				&& a3.movimiento().equals("desplazarse") && a4.movimiento().equals("nadar")
				&& a5.movimiento().equals("reptar")) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un problema en algun metodo movimiento de las subclases y la clase zooAnimales.Animal");
    }
}