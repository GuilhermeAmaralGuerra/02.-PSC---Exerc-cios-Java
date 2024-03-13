//Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o 
//início do dia (00:00).


import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas;
        System.out.println("Digite as horas desse momento: ");
        horas = input.nextInt();
        int minutos;
        System.out.println("Digite os minutos desse momento: ");
        minutos = input.nextInt();
        int calculoHorasMinutos;
        calculoHorasMinutos = horas * 60;
        int minutosTotal;
        minutosTotal = calculoHorasMinutos + minutos;
        System.out.println("Os minutos totais desde o inicio do dia é: " + minutosTotal);
        input.close();
    }
}