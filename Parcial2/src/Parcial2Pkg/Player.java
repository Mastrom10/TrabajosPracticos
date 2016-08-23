package Parcial2Pkg;

import java.util.Objects;

/**
 * Created by Nicolas on 13/07/2016.
 */
public class Player {

    private String nombre;
    private Integer diamantes;
    private Integer puntosAcumulados;

    public Player(String nombre) {
        this.nombre = nombre;
        this.diamantes = 0;
        this.puntosAcumulados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDiamantes() {
        return diamantes;
    }

    public void setDiamantes(Integer diamantes) {
        this.diamantes = diamantes;
    }

    public Integer getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Integer puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(nombre, player.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                ", diamantes=" + diamantes +
                ", puntosAcumulados=" + puntosAcumulados +
                '}';
    }
}
