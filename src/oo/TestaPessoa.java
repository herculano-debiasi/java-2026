package oo;

public class TestaPessoa {
    public static void main(String[] args) {
        // Cria (instancia) objeto fulano
        // a partir da classe Pessoa
        Pessoa fulano = new Pessoa();
        fulano.nome = "Fulano da Silva";
        fulano.idade = 18;
        fulano.peso = 80.5;
        System.out.printf("%s tem %d anos e pesa %.2f kg!\n",
                fulano.nome, fulano.idade, fulano.peso);
        fulano.comer();
        fulano.dormir();
        fulano.respirar();

        System.out.println("====================");
        // Cria objeto herculano a partir da classe Pessoa
        Pessoa herculano = new Pessoa();
        herculano.nome = "Herculano De Biasi";
        herculano.idade = 51;
        herculano.peso = 110;
        System.out.printf("%s tem %d anos e pesa %.2f kg!\n",
                herculano.nome, herculano.idade, herculano.peso);
        herculano.comer();
        herculano.dormir();
        herculano.respirar();
    }
}
