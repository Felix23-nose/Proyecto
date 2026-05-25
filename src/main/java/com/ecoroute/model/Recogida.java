package com.ecoroute.model;

import java.time.LocalDateTime;

/**
 * Representa una recogida de residuos.
 */
public class Recogida {

    private int id;
    private LocalDateTime fechaHora;
    private double cantidadRecogida;

    /**
     * Registra una recogida.
     */
    public void registrar() {
        // TODO: Implementar registro
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public double getCantidadRecogida() {
        return cantidadRecogida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setCantidadRecogida(double cantidadRecogida) {
        this.cantidadRecogida = cantidadRecogida;
    }
}
