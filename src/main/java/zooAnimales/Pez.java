package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {

    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat,
            String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Pez.listado.add(this);
    }

    public Pez() {
        super();
        Pez.listado.add(this);
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }
    
    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    
    public static int cantidadPeces() {
        return Pez.listado.size();
    }
    
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    
    public static ArrayList<Pez> getListado() {
        return listado;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
    	Pez.bacalaos++;
    	return new Pez(nombre, edad, "oceano", genero,"gris", 6);
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
    	Pez.salmones++;
    	return new Pez(nombre, edad, "oceano", genero,"rojo", 6);
    }
}