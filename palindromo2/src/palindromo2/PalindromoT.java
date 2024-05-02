/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindromo2;

/**
 *
 * @author mariangel
 * @param frase La frase a verificar.
 * @return true si la frase es un palíndromo, false de lo contrario.
 */
import java.util.Stack;
class PalindromoT {
    
    public static boolean esPalindromo(String frase) {
        
        Stack<Character> pila = new Stack<>();
        String fraseSinEspacios = frase.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < fraseSinEspacios.length(); i++) {
            pila.push(fraseSinEspacios.charAt(i));
        }

        StringBuilder fraseInvertida = new StringBuilder();
        while (!pila.isEmpty()) {
            fraseInvertida.append(pila.pop());
        }

        System.out.println("Frase invertida: " + fraseInvertida.toString());

        return fraseSinEspacios.equals(fraseInvertida.toString());
    }
}
