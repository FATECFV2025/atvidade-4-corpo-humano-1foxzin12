package main.java;

public class Main {
    public static void main(String[] args) {
        // Criando o objeto c1 da classe CorpoHumano
        CorpoHumano c1 = new CorpoHumano(70.0f, 0.08f, 875.0f);

        // Teste com a linha c1.massa = "2"; (Isso vai gerar um erro de compilação)
        // c1.massa = "2";  // Isso vai causar erro de compilação porque massa é do tipo float, e estamos tentando atribuir uma String

        // Exibindo os valores de massa, volume e densidade utilizando os getters
        System.out.println("Massa: " + c1.getMassa());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println("Densidade: " + c1.getDensidade());

        // Teste para o segundo cenário (alterar o modificador de acesso para public)
        // Exemplo (alterando massa diretamente, se fosse public): c1.massa = 2.0f;

        // Teste para o terceiro cenário (alterar o setter de public para private)
        // Se você fizer isso, o código para setVolume não funcionará mais diretamente aqui.

        // Caso você tenha feito o desafio extra de IMC:
        // Implemente o cálculo do IMC aqui se desejar.
    }
}

