package poo2foro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Desktop extends Equipo {

    //Atributos
    private int memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;
    private int capacidadDiscoDuro;

    public Desktop(String fabricante, String modelo, String microprocesador) {
        super(fabricante, modelo, microprocesador);
    }

    public Desktop( String fabricante, String modelo, String microprocesador, int memoria, String tarjetaGrafica, String tamanoTorre, int capacidadDiscoDuro) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

   

    public int getMemoria() {
        return memoria;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public String getTamanoTorre() {
        return tamanoTorre;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public void setTamanoTorre(String tamanoTorre) {
        this.tamanoTorre = tamanoTorre;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    @Override
    public String toString() {
        return String.format(
                "----- Desktop -----\n"
                + "Fabricante: %s\n"
                + "Modelo: %s\n"
                + "Microprocesador: %s\n"
                + "Memoria: %d GB\n"
                + "Tarjeta gráfica: %s\n"
                + "Tamaño de torre: %s\n"
                + "Capacidad de disco duro: %d GB\n",
                getFabricante(), getModelo(), getMicroprocesador(), getMemoria(), getTarjetaGrafica(), getTamanoTorre(), getCapacidadDiscoDuro());
    }
}
