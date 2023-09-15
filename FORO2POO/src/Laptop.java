/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Laptop extends Equipo{
    
    //Atributos
    private int memoria;
    private double tamanoPantalla;
    private int capacidadDiscoDuro;

    //Constructor
    public Laptop(int memoria, double tamanoPantalla, int capacidadDiscoDuro, String fabricante, String modelo, String microprocesador) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public int getMemoria() {
        return memoria;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    @Override
    public String toString() {
        return "Laptop{" + "memoria=" + memoria + ", tamanoPantalla=" + tamanoPantalla + ", capacidadDiscoDuro=" + capacidadDiscoDuro + '}';
    }
    
    
}
