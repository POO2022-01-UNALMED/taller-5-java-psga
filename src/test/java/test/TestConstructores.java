package test;

import gestion.Zona;
import gestion.Zoologico;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import test.zooAnimales.Pez;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestConstructores {
	
	@Test
   	public void testZoologico(){
		
		Zoologico zoo1 = new Zoologico();
		Zoologico zoo2 = new Zoologico("Central park", "Calle Principal");
		
		boolean ok = false;
		if(zoo1.getNombre() == null && zoo2.getNombre().equals("Central park")) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un error en los constructores de la clase Gestion.Zoologico");
    }
	
	@Test
   	public void testZona(){
		
		Zoologico zoo1 = new Zoologico();
		Zona zona1 = new Zona();
		Zona zona2 = new Zona("salvaje", zoo1);
		
		boolean ok = false;
		if(zona1.getNombre() == null && zona2.getNombre().equals("salvaje")
				&& zona2.getZoo().getNombre() ==  null) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un error en los constructores de la clase Gestion.Zona");
    }
	
	@Test
   	public void testAnimal(){
		
		test.zooAnimales.Animal an1 = new test.zooAnimales.Animal();
		test.zooAnimales.Animal an2 = new test.zooAnimales.Animal("Perro", 10, "casa", "m");
		
		boolean ok = false;
		if(an2.getNombre() == "Perro" && an2.getEdad() == 10
				&& an2.getHabitat().equals("casa") && an2.getGenero().equals("m")) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un error en los constructores de la clase zooAnimales.Animal");
    }
	
	@Test
   	public void testAnfibio(){
		
		test.zooAnimales.Anfibio an1 = new test.zooAnimales.Anfibio();
		test.zooAnimales.Anfibio an2 = new test.zooAnimales.Anfibio("rana", 5, "pradera", "F","verde", false);
		
		boolean ok = false;
		if(an2.getNombre().equals("rana") && an2.getEdad() == 5
				&& an2.getHabitat().equals("pradera") && an2.getGenero().equals("F")
				&& an2.getColorPiel().equals("verde") && an2.isVenenoso() == false) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un error en los constructores de la clase zooAnimales.Anfibio");
    }
	
	@Test
   	public void testAve(){
		
		test.zooAnimales.Ave an1 = new test.zooAnimales.Ave();
		test.zooAnimales.Ave an2 = new test.zooAnimales.Ave("paloma", 5, "ciudad", "F", "gris");
		
		boolean ok = false;
		if(an2.getNombre().equals("paloma") && an2.getEdad() == 5
				&& an2.getHabitat().equals("ciudad") && an2.getGenero().equals("F")
				&& an2.getColorPlumas().equals("gris")) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un error en los constructores de la clase zooAnimales.Ave");
    }
	
	@Test
   	public void testMamifero(){
		
		test.zooAnimales.Mamifero an1 = new test.zooAnimales.Mamifero();
		test.zooAnimales.Mamifero an2 = new test.zooAnimales.Mamifero("persona", 50, "ciudad", "F",false, 2);
		
		boolean ok = false;
		if(an2.getNombre().equals("persona") && an2.getEdad() == 50
				&& an2.getHabitat().equals("ciudad") && an2.getGenero().equals("F")
				&& an2.isPelaje() == false && an2.getPatas() == 2) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un error en los constructores de la clase zooAnimales.Mamifero");
    }
	
	@Test
   	public void testPez(){
		
		test.zooAnimales.Pez an1 = new test.zooAnimales.Pez();
		test.zooAnimales.Pez an2 = new Pez("payaso", 5, "mar", "F", "azul", 3);
		
		boolean ok = false;
		if(an2.getNombre().equals("payaso") && an2.getEdad() == 5
				&& an2.getHabitat().equals("mar") && an2.getGenero().equals("F")
				&& an2.getColorEscamas().equals("azul") && an2.getCantidadAletas() == 3) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un error en los constructores de la clase zooAnimales.Pez");
    }
	
	@Test
   	public void testReptil(){
		
		test.zooAnimales.Reptil an1 = new test.zooAnimales.Reptil();
		test.zooAnimales.Reptil an2 = new test.zooAnimales.Reptil("lagartija", 1, "casa", "F", "cafe", 1);
		
		boolean ok = false;
		if(an2.getNombre().equals("lagartija") && an2.getEdad() == 1
				&& an2.getHabitat().equals("casa") && an2.getGenero().equals("F")
				&& an2.getColorEscamas().equals("cafe") && an2.getLargoCola() == 1) {
			ok = true;
		}
		Assertions.assertTrue(ok, "Hay un error en los constructores de la clase zooAnimales.Reptil");
    }

}
