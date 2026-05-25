package com.ecoroute.model;

import java.util.List;

/**
 * Representa un vehículo de recogida.
 */
public class Vehiculo {

    private int id;
    private String matricula;
    private double capacidadCarga;
    private String estado;
    private List<Recogida> recogidas;

    /**
     * Inicia una ruta.
     */
    public void iniciarRuta() {
        // TODO: Implementar inicio de ruta
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Finaliza una ruta.
     */
    public void finalizarRuta() {
        // TODO: Implementar finalización de ruta
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getEstado() {
        return estado;
    }

    public List<Recogida> getRecogidas() {
        return recogidas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRecogidas(List<Recogida> recogidas) {
        this.recogidas = recogidas;
    }
}
