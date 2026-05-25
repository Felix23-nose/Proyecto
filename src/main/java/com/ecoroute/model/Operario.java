package com.ecoroute.model;

import java.util.List;

/**
 * Representa un operario del sistema EcoRoute.
 */
public class Operario {

    private int id;
    private String nombre;
    private List<Vehiculo> vehiculos;

    /**
     * Inicia sesión en el sistema.
     */
    public void iniciarSesion() {
        // TODO: Implementar inicio de sesión
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Cierra sesión en el sistema.
     */
    public void cerrarSesion() {
        // TODO: Implementar cierre de sesión
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
