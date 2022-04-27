package gestion;
import java.util.ArrayList;
public class Zoologico {
    private String ubicacion;
    private String nombre;
    private ArrayList<Zona> zonas = new ArrayList<Zona>() ;
    public Zoologico() {}
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return this.zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int sum = 0;
        for(int i = 0; i < zonas.size(); i++) {
            sum += zonas.get(i).cantidadAnimales();
        }
        return sum;
    }
}
