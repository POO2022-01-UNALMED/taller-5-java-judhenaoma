package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {

    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona() {

    }

 

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAnimales(Animal animal) {
        this.animales.add(animal);
    }

    public int cantidadAnimales() {
        int cantidad = 0;
        for (int i = 0; i < this.animales.size(); i++) {
            cantidad += 1;
        }
        return cantidad;
    }
    
    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }
}