package com.campusdual;

public class Coche {
    // Atributos
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private String tipoCombustible;
    private int velocimetro;
    private int tacometro;


    // Constructor
    public Coche(String marca, String modelo, int velocidadMaxima, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.velocimetro = 0; // Inicialmente a velocidad cero
        this.tacometro = 0;   // Inicialmente a revoluciones cero
    }



    // Metodos
    public void arrancar() {
        System.out.println("El coche ha arrancado.");
    }

    public void apagar() {
        System.out.println("El coche se ha apagado.");
    }

    public void acelerar(int velocidad) {
        if (velocimetro + velocidad <= velocidadMaxima) {
            velocimetro += velocidad;
            System.out.println("Acelerando a " + velocidad + " km/h. Velocidad actual: " + velocimetro + " km/h.");
        } else {
            System.out.println("No se puede acelerar a esa velocidad. Velocidad máxima alcanzada.");
        }
    }

    public void frenar(int freno) {
        if (velocimetro - freno >= 0) {
            velocimetro -= freno;
            System.out.println("Frenando a " + freno + " km/h. Velocidad actual: " + velocimetro + " km/h.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    public void girarVolante() {
        System.out.println("Girando el volante.");
    }

    public void darMarchaAtras() {
        System.out.println("Dando marcha atrás.");
    }
}