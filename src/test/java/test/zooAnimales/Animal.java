package test.zooAnimales;
import test.gestion.Zona;

public class Animal {

    private String genero;
    private String nombre;
    public static int totalAnimales=0;
    protected String habitat;
    private int edad;
    private Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        totalAnimales++;
    }

    @Override
    public String movimiento(){
        return("desplazarse");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }


    public static String totalPorTipo(){
        return"Mamiferos: "+ Mamifero.cantidadMamiferos() + "\n" +"Aves: " + Ave.cantidadAves() + "\n" +
                "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces()+ "\n"
                + "Anfibios: " + Anfibio.cantidadAnfibios();

    }

    @Override
    public String toString() {
        if(this.zona != null) {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el " + this.zona.getZoo();
        } else {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
        }
    }

}




}

