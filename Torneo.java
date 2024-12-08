/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maila
 */
import java.util.ArrayList;

public class Torneo {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public Torneo() {
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    // Registrar equipos
    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    // Crear partidos
    public void crearPartido(Equipo equipo1, Equipo equipo2, String fecha) {
        Partido partido = new Partido(equipo1, equipo2, fecha);
        partidos.add(partido);
    }

    // Consultar información: Listar equipos
    public void listarEquipos() {
        System.out.println("Equipos registrados:");
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }

    // Consultar información: Mostrar historial de partidos
    public void mostrarHistorial() {
        System.out.println("Historial de partidos:");
        for (Partido partido : partidos) {
            System.out.println(partido);
        }
    }

    // Actualizar resultados
    public void actualizarResultado(int indicePartido, String resultado) {
        if (indicePartido >= 0 && indicePartido < partidos.size()) {
            Partido partido = partidos.get(indicePartido);
            partido.finalizar(resultado);
            System.out.println("Resultado actualizado exitosamente.");
        } else {
            System.out.println("Índice de partido inválido.");
        }
    }
}


