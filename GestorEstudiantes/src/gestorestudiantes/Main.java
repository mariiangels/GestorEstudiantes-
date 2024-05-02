/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorestudiantes;

/**
 *
 * @author mari1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    GestorEstudiantes gestor = new GestorEstudiantes();
    gestor.cargarNombresDesdeArchivo("Programación II(1).txt");

    // Ordenar lista de estudiantes
    gestor.ordenarListaDeEstudiantes();
    System.out.println("Lista de estudiantes ordenada:");
    gestor.mostrarListaDeEstudiantes();
}
    
}
