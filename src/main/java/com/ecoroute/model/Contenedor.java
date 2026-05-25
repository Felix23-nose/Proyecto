package com.ecoroute.model;

/**
 * Representa un contenedor de residuos.
 */
public class Contenedor {

    private int id;
    private String ubicacion;
    private double nivelLlenado;

    /**
     * Vacía el contenedor.
     */
    public void vaciar() {
        // TODO: Implementar vaciado
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Actualiza el nivel de llenado.
     *
     * @param nivel nuevo nivel
     */
    public void actualizarNivel(double nivel) {
        // TODO: Implementar actualización de nivel
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getNivelLlenado() {
        return nivelLlenado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNivelLlenado(double nivelLlenado) {
        this.nivelLlenado = nivelLlenado;
    }
}
