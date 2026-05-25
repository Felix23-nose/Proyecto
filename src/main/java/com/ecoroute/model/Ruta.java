package com.ecoroute.model;

import java.util.List;

/**
 * Representa una ruta de recogida.
 */
public class Ruta {

    private int id;
    private String nombre;
    private double distanciaKm;
    private List<Contenedor> contenedores;

    /**
     * Calcula el tiempo estimado de la ruta.
     *
     * @return tiempo estimado
     */
    public double calcularTiempoEstimado() {
        // TODO: Implementar cálculo de tiempo
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public List<Contenedor> getContenedores() {
        return contenedores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public void setContenedores(List<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }
}
