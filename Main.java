/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maila
 */
public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        // Registrar equipos
        Equipo equipo1 = new Equipo("Tiburones", "Carlos");
        equipo1.agregarJugador("Juan");
        equipo1.agregarJugador("Pedro");

        Equipo equipo2 = new Equipo("Dragones", "Ana");
        equipo2.agregarJugador("Luis");
        equipo2.agregarJugador("Miguel");

        torneo.registrarEquipo(equipo1);
        torneo.registrarEquipo(equipo2);

        // Crear partidos
        torneo.crearPartido(equipo1, equipo2, "10/12/2024");

        // Consultar información
        System.out.println("=== Equipos ===");
        torneo.listarEquipos();

        System.out.println("\n=== Historial de partidos ===");
        torneo.mostrarHistorial();

        // Actualizar resultados
        System.out.println("\n=== Actualizando resultado del primer partido ===");
        torneo.actualizarResultado(0, "2-1");

        System.out.println("\n=== Historial actualizado ===");
        torneo.mostrarHistorial();
    }
}


