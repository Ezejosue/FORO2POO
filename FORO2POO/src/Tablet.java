/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Tablet extends Equipo{
    
    //Atributos
    private double tamanoDiagonalPantalla;
    private String capacidadPantalla;
    private int tamanoMemoriaNAND;
    private String sistemaOperativo;

    //Constructor
    public Tablet(double tamanoDiagonalPantalla, String capacidadPantalla, int tamanoMemoriaNAND, String sistemaOperativo, String fabricante, String modelo, String microprocesador) {
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
        return "Tablet{" + "tamanoDiagonalPantalla=" + tamanoDiagonalPantalla + ", capacidadPantalla=" + capacidadPantalla + ", tamanoMemoriaNAND=" + tamanoMemoriaNAND + ", sistemaOperativo=" + sistemaOperativo + '}';
    }

}