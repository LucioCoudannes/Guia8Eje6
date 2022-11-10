/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author A288808
 */
public class Producto {
    
    private String marca;
    private Double precio;

    public Producto() {
    }

    public Producto(String marca, Double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Almacen{" + "marca=" + marca + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
