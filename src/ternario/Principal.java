package ternario;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Persona per1 = new Persona("Fulano", "Gomez", 25, 2);
        Persona per2 = new Persona("Maria", "Perez", 28, 1);
        Persona per3 = new Persona("Sultano", "Rodriguez", 33, 0);
        Persona per4 = new Persona("Ana", "Gonzalez", 45, 4);

        per1.presentarse();
        per2.presentarse();
        per3.presentarse();
        per4.presentarse();
    }

}
