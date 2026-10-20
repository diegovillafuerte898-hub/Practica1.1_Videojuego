public class Videojuego {

    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
        System.out.println("\nEl videojuego " + nombre + " ha iniciado.");
    }

    void cerrar() {
        activo = false;
        System.out.println("\nEl videojuego " + nombre + " se ha cerrado.");
    }

    void mostrarVersion() {
        System.out.println("\n"+nombre+" Versión actual: " + version);
    }
}
