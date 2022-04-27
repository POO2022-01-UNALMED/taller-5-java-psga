package test.zooAnimales;

import java.util.ArrayList;
public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado=new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        listado.add(this);
    }

    public String getColorPiel() {
        return colorPiel;
    }
    public void setColorPiel(String colorPiel) {
        this.colorPiel=colorPiel;
    }
    public void setListado(ArrayList<Anfibio> listado) {
        this.listado=listado;
    }
    public static ArrayList<Anfibio> getListado(){
        return listado;
    }
    public boolean isVenenoso() {
        return venenoso;
    }
    public void setVenenoso(boolean venenoso) {
        this.venenoso=venenoso;
    }

    public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
        super(nombre,edad,habitat,genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.add(this);
    }

    public String movimiento() {
        return "saltar";
    }

    public static Anfibio crearRana(String nombre,int edad, String genero) {
        Anfibio a=new Anfibio();
        a.setEdad(edad);a.setGenero(genero);a.setNombre(nombre);
        a.colorPiel ="rojo"; a.venenoso = true ;a.setHabitat("selva");
        ranas++;
        listado.add(a);
        return a;
    }

    public static Anfibio crearSalamandra(String nombre,int edad, String genero) {
        Anfibio a=new Anfibio();
        a.setEdad(edad);a.setGenero(genero);a.setNombre(nombre);
        a.colorPiel ="negro y amarillo"; a.venenoso = false ;a.setHabitat("selva");
        salamandras++;
        listado.add(a);
        return a;
    }

    public static int cantidadAnfibios() {
        return ranas+salamandras;
    }

}