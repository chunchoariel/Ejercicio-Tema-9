package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 40;
        cliente.nombre = "Rogerio Delgado";
        cliente.telefono = 123456789;

        Trabajador trabajador = new Trabajador();

        System.out.println("El cliente: " + cliente.nombre);
        System.out.println("Con edad de: " + cliente.edad);
        System.out.println("Su teléfono es: " + cliente.telefono);
        System.out.println("Tiene un crédito aprobado de: " + cliente.credito);

        System.out.println("Con un sueldo de: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;


}

class Cliente extends Persona{
    int credito = 7000;
}

class Trabajador extends Persona{
    int salario = 2500;
}