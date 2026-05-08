/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Acer
 */
public class ArchivoCliente {

    private String nombre;
    private String estado;

    public ArchivoCliente(String nombre) {

        this.nombre = nombre;
        this.estado = "Pendiente";
    }

    public String getNombre() {

        return nombre;
    }

    public String getEstado() {

        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }
}