package basico;

public class Decisao {
    public static void main(String[] args) {
        int nota = 7;

        if (nota >= 7) {
            System.out.println("Passou direto!");
        } else if (nota >= 4 && nota < 7) {
            System.out.println("Pegou exame!");
        } else {
            System.out.println("Reprovou!");
        }
    }
}
