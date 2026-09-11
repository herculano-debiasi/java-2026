package basico;

public class Repeticao {
    public static void main(String[] args) {
        // Exemplo do for() crescente
        System.out.println("Lista de 1 até 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Exemplo do for() decrescente
        System.out.println("\n\nLista de 10 até 1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Versão crescente com o while()
        System.out.println("\n\nLista crescente com while()");
        int numero = 1; // inicialização da variável
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }

        // Versão decrescente com o while()
        System.out.println("\n\nLista decrescente com while()");
        numero = 10; // inicialização da variável
        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }
    }
}
