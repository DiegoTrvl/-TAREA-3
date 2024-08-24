/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.producto;

// Clase abstracta Producto
public abstract class Producto {
    // Atributos
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos abstractos
    public abstract void agregarCantidad(int cantidad);
    public abstract void vender(int cantidad);

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}

// Clase concreta que extiende de Producto
public class ProductoConcreto extends Producto {

    // Constructor
    public ProductoConcreto(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    // Implementación del método agregarCantidad
    @Override
    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
        System.out.println("Se han agregado " + cantidad + " unidades de " + nombre + ". Total en inventario: " + this.cantidad);
    }

    // Implementación del método vender
    @Override
    public void vender(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades de " + nombre + ". Total en inventario: " + this.cantidad);
        } else {
            System.out.println("No se puede realizar la operación. Cantidad insuficiente en inventario.");
        }
    }
}

