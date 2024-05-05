package src.com.santanderbootcamp.bruno.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        //Operador de atribuição:
        int exemplo_atribuicao = 1;

        //Operadores aritméticos:
        double soma = 10 + 10.1;
        double subtracao = 10 - 10.1;
        double multiplicacao = 10 * 10;
        int divisao = 10 / 2;
        int modulo = 18 % 3;
        double result = (10 + 1) + (2*10);
        System.out.println(result);

        //Operadores unários:
        int numero = 1;
        int numero_negativado = - numero;
        System.out.println(numero_negativado);
        int numero_positivado = + numero;
        System.out.println(numero_positivado);
        ++numero;
        System.out.println(numero);
        --numero;
        System.out.println(numero);

        //Operadores ternários:
        int a = 1;
        int b = 1;

        String resultado_ternario = a==b ? "Verdade" : "Falso";
        System.out.println(resultado_ternario);

        //Operadores relacionais:
        int numero1 = 1;
        int numero2 = 2;

        boolean resultado_comparacao = numero1 == numero2;
        System.out.println(resultado_comparacao);

        boolean resultado_comparacao_difereca = numero1 != numero2;
        System.out.println(resultado_comparacao_difereca);

        boolean resultado_comparacao_maiorIgual = numero1 >= numero2;
        System.out.println(resultado_comparacao_maiorIgual);

        //EQUALS compara conteúdos! (Recomendado para objetos)
    }
}
