/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleado;

abstract class Empleado {
    String nombre;
    String id;
    double salario_base;

    public Empleado(String nombre, String id, double salario_base) {
        this.nombre = nombre;
        this.id = id;
        this.salario_base = salario_base;
    }

    // Método abstracto
    abstract double calcularSalario();

    // Método concreto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: " + salario_base);
    }
}
class EmpleadoAsalariado extends Empleado {
    public EmpleadoAsalariado(String nombre, String id, double salario_base) {
        super(nombre, id, salario_base);
    }

    @Override
    double calcularSalario() {
        // Aquí puedes agregar lógica adicional si hay bonos u otros factores
        return salario_base;
    }
}
class EmpleadoPorHoras extends Empleado {
    double horasTrabajadas;
    double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String id, double salario_base, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, id, salario_base);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
