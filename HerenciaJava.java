// Clase base Persona
// Representa una persona con nombre y edad.
// Esta clase será la base para las clases derivadas.

public class Persona {
    protected String nombre;
    protected int edad;

    // Constructor de la clase base
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método común a todas las personas
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // Método que puede ser sobrescrito por las subclases
    public void actividad() {
        System.out.println(nombre + " está realizando una actividad general.");
    }
}
