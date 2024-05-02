/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorestudiantes;

/**
 *
 * @author mari1
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GestorEstudiantes {

    private HashSet<String> nombresSet;
    private LinkedList<String> listaEstudiantes;

    public GestorEstudiantes() {
        this.nombresSet = new HashSet<>();
        this.listaEstudiantes = new LinkedList<>();
    }

    public void cargarNombresDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!nombresSet.add(linea)) {
                    System.out.println("Nombre repetido: " + linea);
                }
                listaEstudiantes.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ordenarListaDeEstudiantes() {
        Collections.sort(listaEstudiantes);
    }

    public void agregarEstudiante(String estudiante, boolean alInicio) {
        if (alInicio) {
            listaEstudiantes.addFirst(estudiante);
        } else {
            listaEstudiantes.addLast(estudiante);
        }
        nombresSet.add(estudiante);
    }

    public void removerEstudiante(String estudiante) {
        listaEstudiantes.remove(estudiante);
        nombresSet.remove(estudiante);
    }

    public void editarEstudiante(String antiguoEstudiante, String nuevoEstudiante) {
        if (listaEstudiantes.contains(antiguoEstudiante)) {
            int indice = listaEstudiantes.indexOf(antiguoEstudiante);
            listaEstudiantes.set(indice, nuevoEstudiante);
            nombresSet.remove(antiguoEstudiante);
            nombresSet.add(nuevoEstudiante);
        } else {
            System.out.println("Estudiante no encontrado: " + antiguoEstudiante);
        }
    }

    public void buscarEstudiante(String estudiante) {
        if (nombresSet.contains(estudiante)) {
            System.out.println("Estudiante encontrado: " + estudiante);
        } else {
            System.out.println("Estudiante no encontrado: " + estudiante);
        }
    }

    public void mostrarListaDeEstudiantes() {
        for (String estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }

 
}


