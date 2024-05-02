
package palindromo2;

/**
 *
 * @author mariangel
 */
public class Palindromo2 {

    /**
     *
     * Método main principal que prueba si una frase es un palíndromo utilizando
     * PalindromoT
     *
     */
    public static void main(String[] args) {

        String frase = "Amad a la dama";
        String frase2 = "Aunque la mona se vista de seda, mona se queda";

        System.out.println("Frase 1: " + frase);
        if (PalindromoT.esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

        System.out.println("\nFrase 2: " + frase2);
        if (PalindromoT.esPalindromo(frase2)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }

}
