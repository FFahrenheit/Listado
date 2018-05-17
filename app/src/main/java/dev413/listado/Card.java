package dev413.listado;

/**
 * Created by User on 2018-04-23.
 */

public class Card {
    private int imagen;
    private String descripcion;
    private String nombre;
    private String edad;

    public String getEdad() {
        return edad;
    }

    public int getImagen() {
        return imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(String userEdad) {
        edad = userEdad;
    }

    public void setImagen(int userImagen) {
        imagen = userImagen;
    }

    public void setDescripcion(String userDescripcion) {
        descripcion = userDescripcion;
    }

    public void setNombre(String userNombre) {
        nombre = userNombre;
    }

    public Card() {
        imagen=0;
        nombre="Sin Nombre";
        descripcion="Breve descripción de mi persona.";
        edad="18";
    }

    public Card(String userEdad, String userNombre, String userDescripcion, int userImagen){
        edad=userEdad;
        nombre=userNombre;
        descripcion=userDescripcion;
        imagen=userImagen;
    }
}
