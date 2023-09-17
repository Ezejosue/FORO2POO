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
        
    public static void registrarEquipo(){
        
    }
    
    public static void verEquipos(){
    }
}
