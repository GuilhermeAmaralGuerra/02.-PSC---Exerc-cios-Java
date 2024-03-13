//Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? 
//Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, 
//quando abastecido com etanol, logo, 
//só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. 
//Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis,
// e informe qual deve ser a escolha, com base no custo.


import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2, num3;
        System.out.println("O exemplo é: num1 = num2 " + "\n" + "\t\t" + "num3 = x");
        System.out.println("Digite o valor do número 1: ");
        num1 = input.nextFloat();
        System.out.println("Digite o valor do número 2: ");
        num2 = input.nextFloat();
        System.out.println("Digite o valor do múmero 3: ");
        num3 = input.nextFloat();
        float calculo;
        calculo = (num3 * num2) / num1;
        System.out.println("O resultado da regra de três é: " + calculo);
        input.close();
    }
}
