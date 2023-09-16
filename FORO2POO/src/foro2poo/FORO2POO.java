/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro2poo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JOptionPane; 

/**
 *
 * @author PC
 */
public class FORO2POO extends JApplet {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcion;
        do {
            String menu = "Menú de Equipos:\n" +
                    "1. Registrar Equipo\n" +
                    "2. Ver Equipos Registrados\n" +
                    "3. Salir\n\n" +
                    "Ingrese el número de la opción:";
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opcion) {
                    case 1:
                        registrarEquipo();
                        break;
                    case 2:
                        verEquiposRegistrados();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "¡Proceso Terminado!");
                        opcion = 3; // Salir del bucle
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, ingrese una opción válida.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                opcion = 0;
            }
        } while (opcion != 3);
    }

    private static void registrarEquipo() {
        String tipoEquipo = JOptionPane.showInputDialog(
                "Seleccione el tipo de equipo a registrar:\n" +
                        "1. Desktop\n" +
                        "2. Laptop\n" +
                        "3. Tablet\n\n" +
                        "Ingrese el número de la opción de registro:"
        );

        switch (tipoEquipo) {
            case "1":
                registrarDesktop();
                break;
            case "2":
                registrarLaptop();
                break;
            case "3":
                registrarTablet();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción de registro no válida.");
                break;
        }
    }

    private static void registrarDesktop() {
        String fabricante = JOptionPane.showInputDialog(null, "Ingrese el fabricante del Desktop:");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del Desktop:");
        String microprocesador = JOptionPane.showInputDialog(null, "Ingrese el microprocesador del Desktop:");
        String memoria = JOptionPane.showInputDialog(null, "Ingrese la memoria del Desktop:");
        String tarjetaGrafica = JOptionPane.showInputDialog(null, "Ingrese la tarjeta gráfica del Desktop:");
        String tamanoTorre = JOptionPane.showInputDialog(null, "Ingrese el tamaño de la torre del Desktop:");
        String capacidadDiscoDuro = JOptionPane.showInputDialog(null, "Ingrese la capacidad de disco duro del Desktop:");

        // Aquí puedes utilizar los datos ingresados para crear un objeto Desktop y guardarlo en tu lista de equipos
        // Desktop desktop = new Desktop(...);
        // equipos[contadorEquipos] = desktop;

        JOptionPane.showMessageDialog(null, "Desktop registrado con éxito.");
    }

    private static void registrarLaptop() {
        String fabricante = JOptionPane.showInputDialog(null, "Ingrese el fabricante de la Laptop:");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo de la Laptop:");
        String microprocesador = JOptionPane.showInputDialog(null, "Ingrese el microprocesador de la Laptop:");
        String memoria = JOptionPane.showInputDialog(null, "Ingrese la memoria de la Laptop:");
        String tamanoPantalla = JOptionPane.showInputDialog(null, "Ingrese el tamaño de la pantalla de la Laptop:");
        String capacidadDiscoDuro = JOptionPane.showInputDialog(null, "Ingrese la capacidad de disco duro de la Laptop:");

        // Aquí puedes utilizar los datos ingresados para crear un objeto Laptop y guardarlo en tu lista de equipos
        // Laptop laptop = new Laptop(...);
        // equipos[contadorEquipos] = laptop;

        JOptionPane.showMessageDialog(null, "Laptop registrada con éxito.");
    }

    private static void registrarTablet() {
        String fabricante = JOptionPane.showInputDialog(null, "Ingrese el fabricante de la Tablet:");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo de la Tablet:");
        String microprocesador = JOptionPane.showInputDialog(null, "Ingrese el microprocesador de la Tablet:");
        String tamanoPantalla = JOptionPane.showInputDialog(null, "Ingrese el tamaño de la pantalla de la Tablet:");
        String tamanoMemoriaNAND = JOptionPane.showInputDialog(null, "Ingrese el tamaño de memoria NAND de la Tablet:");
        String sistemaOperativo = JOptionPane.showInputDialog(null, "Ingrese el sistema operativo de la Tablet:");

        // Aquí puedes utilizar los datos ingresados para crear un objeto Tablet y guardarlo en tu lista de equipos
        // Tablet tablet = new Tablet(...);
        // equipos[contadorEquipos] = tablet;

        JOptionPane.showMessageDialog(null, "Tablet registrada con éxito.");
    }

    private static void verEquiposRegistrados() {
        // Lógica para ver equipos registrados
        // Aquí puedes mostrar los equipos registrados en una ventana de JOptionPane
        // Puedes obtener los datos de las clases que proporcionaste anteriormente.

        JOptionPane.showMessageDialog(null, "Lista de equipos registrados:\n\n" +
                "1. Equipo 1\n" +
                "2. Equipo 2\n" +
                "3. ...");
        
        
        
        
    }
    
}
