package gestion;

import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private static ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico() {

    }
    
    public static ArrayList<Zona> getZona() {
        return zonas;
    }

    public static void setZonas(ArrayList<Zona> zonas) {
        Zoologico.zonas = zonas;
    }

    public String getNombre() {
        return nombre;
    }

    

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

   

    public void agregarZonas(Zona zona) {
         Zoologico.zonas.add(zona);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int cantidadTotalAnimales() {
        int contador = 0;
        for (int i = 0; i < Zoologico.zonas.size(); i++) {
            contador += Zoologico.zonas.get(i).cantidadAnimales();
        }
        return contador;
    }
}