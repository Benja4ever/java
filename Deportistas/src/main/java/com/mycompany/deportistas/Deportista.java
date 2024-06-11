
package com.mycompany.deportistas;

/**
 *
 * @author Alumno
 */
public class Deportista extends Persona{
    String deporte;

    public Deportista(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        if (edad < 5)
            deporte = "Patinaje"; 
        else if ( 5 <= edad && edad < 7 )
            deporte = "Karate";
        else if (7 <= edad && edad < 10)
            deporte = "Judo";
        else if (10 <= edad)
            deporte = "Escalada";
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Deportista{" + " nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", deporte=" + deporte + '}';
    }
    
    
}
