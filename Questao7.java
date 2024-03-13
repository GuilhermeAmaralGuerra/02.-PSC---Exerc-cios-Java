//Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float largura, comprimento, preco;
        System.out.println("Digite o valor da largura: ");
        largura = input.nextFloat();
        System.out.println("Digite o valor do comprimento: ");
        comprimento = input.nextFloat();
        System.out.println("Digite o valor por metro quadrado: ");
        preco = input.nextFloat();

        float calculoArea;
        calculoArea = largura * comprimento;

        float porcentagem;
        porcentagem = calculoArea / 100;

        float acabamento;
        acabamento = calculoArea + (porcentagem * 10);

        double calculoTotal;
        calculoTotal = (int) Math.ceil(acabamento);

        float precoTotal;
        precoTotal = preco * calculoArea;

        System.out.println("O valor da área preenchida mais o acabamento é: " + calculoTotal + "\n" + "O valor total a ser pago é: " + precoTotal);
        input.close();
    }
}
