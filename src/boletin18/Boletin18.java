/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin18 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Buzon buzon1 = new Buzon();
    ArrayList<Correo> correos = new ArrayList<>();
    buzon1.setCorreos(correos);
    boolean exit = false;
    do {
        String opcion = JOptionPane.showInputDialog("Opciones:\n"+ "1) Mostrar Nº de Correos\n"+ "2) Añadir un nuevo Correo\n"+ "3) Mostrar si hay mensajes sin leer\n"+ "4) Mostrar primer correo sin leer\n"+ "5) Mostrar un Correo\n"+ "6) Eliminar un Correo\n"+ "7) Salir");
    switch(opcion){
        case "1":
            System.out.format("Hay %d correos en el buzon\n", correos.size()); 
            break;
        case "2":
            Correo correo8 = new Correo(JOptionPane.showInputDialog("Escribe el mensaje del nuevo correo"));
            buzon1.engade(correo8);
            break;
        case "3":
            if (buzon1.porLeer() == false){
                System.out.println("Hay mensajes sin leer.");
            } else {
                System.out.println("Todos los mensajes han sido leidos.");
            }
            break;
        case "4":
            System.out.println("Mensaje --> " + buzon1.amosaPrimerNoLeido());
            break;
        case "5":
            System.out.println(buzon1.amosa(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de el mensaje que quieres leer."))));
            break;
        case "6":   
            buzon1.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de el mensaje que quieras eliminar.")));
            break;
        case "7":
            exit = true;
            break;
    }
    } while(exit == false);
}
}