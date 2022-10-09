package Questao6;

import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
// Area = 2 * PI * R
public class Exerc6 {
    public static void main(String[] args){
        double area, raio;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Raio:");
        
            raio = sc1.nextFloat();

            area = 2 * Math.PI * raio;

        System.out.println("A área do círculo é " + area);

        sc1.close();
    }
}
