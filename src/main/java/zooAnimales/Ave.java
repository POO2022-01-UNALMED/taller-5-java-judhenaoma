package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {

    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat,
            String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);
    }

    public Ave() {
        super();
        Ave.listado.add(this);
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }
    
    public static int cantidadAves() {
        return Ave.listado.size();
    }
    
    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }
    
    @Override
    public String movimiento() {
        return "volar";
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    
    public static Ave crearAguila(String nombre, int edad, String genero) {
    	Ave.aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
    	Ave.halcones++;
    	return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }

    
}