//Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. 
//O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.


import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float lado1, lado2, lado3, lado4;
        System.out.println("Digite o valor do lado 1: ");
        lado1 = input.nextFloat();
        System.out.println("Digite o valor do lado 2: ");
        lado2 = input.nextFloat();
        System.out.println("Digite o valor do lado 3: ");
        lado3 = input.nextFloat();
        System.out.println("Digite o valor do lado 4: ");
        lado4 = input.nextFloat();

        float calculoArea;
        calculoArea = lado1 * lado2;

        float calculoPerimetro;
        calculoPerimetro = lado1 + lado2 + lado3 + lado4;

        double calculoDiagonal;
        calculoDiagonal = Math.sqrt((lado1 * lado1) + (lado2 * lado2));

        System.out.println("O resultado dos calculos é: " + "\n" + "O valor da área do retângulo é: " + calculoArea + "\n" + "O valor do perimetro é: " + calculoPerimetro + "\n" + "O valor da diagonal é: " + calculoDiagonal);
        input.close();
    }
}
