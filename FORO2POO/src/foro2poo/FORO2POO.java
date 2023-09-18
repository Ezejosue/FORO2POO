/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro2poo;

import poo2foro.Tablet;
import poo2foro.Laptop;
import poo2foro.Desktop;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
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
import java.awt.*;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class FORO2POO extends JApplet {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Desktop> desktops = new ArrayList<>();
    private static ArrayList<Laptop> laptops = new ArrayList<>();
    private static ArrayList<Tablet> tablets = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog("1. Registrar equipo\n2. Ver equipos\n3. Salir");
            switch (opcion) {
                case "1":
                    registrarEquipo();
                    break;
                case "2":
                    verEquipos();
                    break;
                case "3":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    public static String solicitarDato(String mensaje) {
        String dato;
        do {
            dato = JOptionPane.showInputDialog(mensaje);
            if (dato == null) {
                return null;
            }
            if (dato == null || dato.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío. Intente de nuevo.");
            }
        } while (dato == null || dato.trim().isEmpty());
        return dato;
    }

    public static void registrarEquipo() {
        String[] opciones = {"Desktop", "Laptop", "Tablet"};
        int tipoEquipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de equipo a registrar", "Registro de Equipos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        String fabricante = solicitarDato("Ingrese el fabricante:");
        if (fabricante == null) {
            return; // Regresar al menú principal si el usuario hizo clic en "Cancelar"
        }
        String modelo = solicitarDato("Ingrese el modelo:");
        if (modelo == null) {
            return; // Regresar al menú principal si el usuario hizo clic en "Cancelar"
        }
        String microprocesador = solicitarDato("Ingrese el microprocesador:");
        if (microprocesador == null) {
            return; // Regresar al menú principal si el usuario hizo clic en "Cancelar"
        }
        switch (tipoEquipo) {
            case 0: // Desktop
                String memoriaStr = solicitarDato("Ingrese la memoria (en GB):");
                if (memoriaStr == null) {
                    return;
                }
                int memoria = Integer.parseInt(memoriaStr);

                String tarjetaGrafica = solicitarDato("Ingrese la tarjeta gráfica:");
                if (tarjetaGrafica == null) {
                    return;
                }

                String tamanoTorre = solicitarDato("Ingrese el tamaño de la torre:");
                if (tamanoTorre == null) {
                    return;
                }

                String capacidadDiscoDuroStr = solicitarDato("Ingrese la capacidad del disco duro (en GB):");
                if (capacidadDiscoDuroStr == null) {
                    return;
                }
                int capacidadDiscoDuro = Integer.parseInt(capacidadDiscoDuroStr);

                desktops.add(new Desktop(fabricante, modelo, microprocesador, memoria, tarjetaGrafica, tamanoTorre, capacidadDiscoDuro));
                break;

            case 1: // Laptop
                String memoriaLapStr = solicitarDato("Ingrese la memoria (en GB):");
                if (memoriaLapStr == null) {
                    return;
                }
                int memoriaLap = Integer.parseInt(memoriaLapStr);

                String tamanoPantallaStr = solicitarDato("Ingrese el tamaño de la pantalla (en pulgadas):");
                if (tamanoPantallaStr == null) {
                    return;
                }
                double tamanoPantalla = Double.parseDouble(tamanoPantallaStr);

                String capacidadDiscoDuroLapStr = solicitarDato("Ingrese la capacidad del disco duro (en GB):");
                if (capacidadDiscoDuroLapStr == null) {
                    return;
                }
                int capacidadDiscoDuroLap = Integer.parseInt(capacidadDiscoDuroLapStr);

                laptops.add(new Laptop(fabricante, modelo, microprocesador, memoriaLap, tamanoPantalla, capacidadDiscoDuroLap));
                break;

            case 2: // Tablet
                String tamanoDiagonalPantallaStr = solicitarDato("Ingrese el tamaño diagonal de la pantalla (en pulgadas):");
                if (tamanoDiagonalPantallaStr == null) {
                    return;
                }
                double tamanoDiagonalPantalla = Double.parseDouble(tamanoDiagonalPantallaStr);

                String capacidadPantalla = solicitarDato("Ingrese la capacidad de la pantalla (Capacitiva/Resistiva):");
                if (capacidadPantalla == null) {
                    return;
                }

                String tamanoMemoriaNANDStr = solicitarDato("Ingrese el tamaño de memoria NAND (en GB):");
                if (tamanoMemoriaNANDStr == null) {
                    return;
                }
                int tamanoMemoriaNAND = Integer.parseInt(tamanoMemoriaNANDStr);

                String sistemaOperativo = solicitarDato("Ingrese el sistema operativo:");
                if (sistemaOperativo == null) {
                    return;
                }

                tablets.add(new Tablet(fabricante, modelo, microprocesador, tamanoDiagonalPantalla, capacidadPantalla, tamanoMemoriaNAND, sistemaOperativo));
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }

    public static void verEquipos() {
        String[] opciones = {"Desktop", "Laptop", "Tablet"};
        int tipoEquipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de equipo que desea ver", "Vista de Equipos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        DefaultTableModel modeloTabla = new DefaultTableModel();

        switch (tipoEquipo) {
            case 0: // Desktop
                modeloTabla.addColumn("Fabricante");
                modeloTabla.addColumn("Modelo");
                modeloTabla.addColumn("Microprocesador");
                modeloTabla.addColumn("Memoria (GB)");
                modeloTabla.addColumn("Tarjeta Gráfica");
                modeloTabla.addColumn("Tamaño Torre");
                modeloTabla.addColumn("Capacidad Disco Duro (GB)");

                for (Desktop desktop : desktops) {
                    modeloTabla.addRow(new Object[]{
                        desktop.getFabricante(),
                        desktop.getModelo(),
                        desktop.getMicroprocesador(),
                        desktop.getMemoria(),
                        desktop.getTarjetaGrafica(),
                        desktop.getTamanoTorre(),
                        desktop.getCapacidadDiscoDuro()
                    });
                }
                break;

            case 1: // Laptop
                modeloTabla.addColumn("Fabricante");
                modeloTabla.addColumn("Modelo");
                modeloTabla.addColumn("Microprocesador");
                modeloTabla.addColumn("Memoria (GB)");
                modeloTabla.addColumn("Tamaño Pantalla (pulgadas)");
                modeloTabla.addColumn("Capacidad Disco Duro (GB)");

                for (Laptop laptop : laptops) {
                    modeloTabla.addRow(new Object[]{
                        laptop.getFabricante(),
                        laptop.getModelo(),
                        laptop.getMicroprocesador(),
                        laptop.getMemoria(),
                        laptop.getTamanoPantalla(),
                        laptop.getCapacidadDiscoDuro()
                    });
                }
                break;

            case 2: // Tablet
                modeloTabla.addColumn("Fabricante");
                modeloTabla.addColumn("Modelo");
                modeloTabla.addColumn("Microprocesador");
                modeloTabla.addColumn("Tamaño Diagonal Pantalla (pulgadas)");
                modeloTabla.addColumn("Capacidad Pantalla");
                modeloTabla.addColumn("Tamaño Memoria NAND (GB)");
                modeloTabla.addColumn("Sistema Operativo");

                for (Tablet tablet : tablets) {
                    modeloTabla.addRow(new Object[]{
                        tablet.getFabricante(),
                        tablet.getModelo(),
                        tablet.getMicroprocesador(),
                        tablet.getTamanoDiagonalPantalla(),
                        tablet.getCapacidadPantalla(),
                        tablet.getTamanoMemoriaNAND(),
                        tablet.getSistemaOperativo()
                    });
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }

        // Crear una JTable con el modelo de tabla
        // Crear una JTable con el modelo de tabla
        JTable table = new JTable(modeloTabla);

        // Crear un JScrollPane para la tabla
        JScrollPane scrollPane = new JScrollPane(table);

        // Crear un JDialog para mostrar la tabla
        JDialog dialog = new JDialog();
        dialog.setTitle("Lista de Equipos");
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dialog.add(scrollPane);
        dialog.pack();
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);
    }
}
