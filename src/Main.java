//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Videojuego juego1 = new Videojuego();
    Videojuego juego2 = new Videojuego();
    Videojuego juego3 = new Videojuego();

    juego1.nombre = "Tetris";
    juego1.genero = "Puzzle";
    juego1.version = "1.0.0";
    juego1.activo = false;

    juego2.nombre = "Doom";
    juego2.genero = "Acción";
    juego2.version = "2.1.4";
    juego2.activo = false;

    juego3.nombre = "Street Fighter";
    juego3.genero = "Lucha";
    juego3.version = "1.2.0";
    juego3.activo = false;

    System.out.println("\nVideojuego 1");
    juego1.iniciar();
    juego1.mostrarInformacion();
    juego1.cerrar();
    juego1.mostrarInformacion();

    System.out.println("\nVideojuego 2");
    juego2.mostrarInformacion();

    System.out.println("\nVideojuego 3");
    juego3.mostrarInformacion();

    juego3.version = "2.0.1";
    juego3.mostrarVersion();
}
