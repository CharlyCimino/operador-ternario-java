package ternario;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int cantHijos;

    public Persona(String nombre, String apellido, int edad, int cantHijos) {
//        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cantHijos = cantHijos;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + this.nombre
                + " y tengo " + this.cantHijos + " hijo" + (this.cantHijos != 1 ? "s" : ""));
    }

}
