//Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. 
//Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos.


import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float MB, Mbps;
        System.out.println("Digite o tamanho do arquivo em MB: ");
        MB = input.nextFloat();
        System.out.println("Digite a velocidade do link em Mbps: ");
        Mbps = input.nextFloat();

        float coversorMB;
        coversorMB = MB / 8;

        float calculoVelocidade;
        calculoVelocidade = coversorMB / Mbps;

        float calculoMinutos;
        calculoMinutos = calculoVelocidade / 60;

        System.out.println("O tempo de espera é " + calculoMinutos + " minutos");

        input.close();
    }
}
