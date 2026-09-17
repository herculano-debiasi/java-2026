package basico;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Digite a nota entre 0 e 10 [-1 para finalizar]: ");
            nota = entrada.nextInt();

            // Se nota for < -1 ou se nota for > 10
            if (nota < -1 || nota > 10) {
                System.out.println("Valor inválido! Tente novamente!");
                continue;
            }

            // -1 é o valor que encerra o programa
            if (nota == -1) {
                System.out.println("Encerrando o sistema!");
                break;
            }

            if (nota >= 7) {
                System.out.println("Passou direto!");
            } else if (nota >= 4 && nota < 7) {
                System.out.println("Pegou exame!");
            } else {
                System.out.println("Reprovou!");
            }
        } while (nota != -1);
    }
}
