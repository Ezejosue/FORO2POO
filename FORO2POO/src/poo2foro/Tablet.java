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
public class Tablet extends Equipo {

    //Atributos
    private double tamanoDiagonalPantalla;
    private String capacidadPantalla;
    private int tamanoMemoriaNAND;
    private String sistemaOperativo;

    //Constructor
    public Tablet( String fabricante, String modelo, String microprocesador, double tamanoDiagonalPantalla, String capacidadPantalla, int tamanoMemoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador);
        this.tamanoDiagonalPantalla = tamanoDiagonalPantalla;
        this.capacidadPantalla = capacidadPantalla;
        this.tamanoMemoriaNAND = tamanoMemoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getTamanoDiagonalPantalla() {
        return tamanoDiagonalPantalla;
    }

    public String getCapacidadPantalla() {
        return capacidadPantalla;
    }

    public int getTamanoMemoriaNAND() {
        return tamanoMemoriaNAND;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setTamanoDiagonalPantalla(double tamanoDiagonalPantalla) {
        this.tamanoDiagonalPantalla = tamanoDiagonalPantalla;
    }

    public void setCapacidadPantalla(String capacidadPantalla) {
        this.capacidadPantalla = capacidadPantalla;
    }

    public void setTamanoMemoriaNAND(int tamanoMemoriaNAND) {
        this.tamanoMemoriaNAND = tamanoMemoriaNAND;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return String.format(
                "----- Tablet -----\n"
                + "Fabricante: %s\n"
                + "Modelo: %s\n"
                + "Microprocesador: %s\n"
                + "Tamaño diagonal de pantalla: %.2f pulgadas\n"
                + "Capacidad de pantalla: %s\n"
                + "Tamaño de memoria NAND: %d GB\n"
                + "Sistema Operativo: %s\n",
                getFabricante(), getModelo(), getMicroprocesador(), getTamanoDiagonalPantalla(), getCapacidadPantalla(), getTamanoMemoriaNAND(), getSistemaOperativo());
    }

}
