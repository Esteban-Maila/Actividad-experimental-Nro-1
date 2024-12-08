/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maila
 */
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String entrenador;
    private ArrayList<String> jugadores;

    public Equipo(String nombre, String entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(String jugador) {
        jugadores.add(jugador);
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + ", Entrenador: " + entrenador + ", Jugadores: " + jugadores;
    }
}

