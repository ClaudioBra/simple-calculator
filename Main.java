package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, menu;

        System.out.println("MENU");
        System.out.println("1- SOMA");
        System.out.println("2- SUBTRAÇÃO");
        System.out.println("3- DIVISÃO");
        System.out.println("4- MULTIPLICAÇÃO");
        System.out.println("5- SAIR");
        Scanner teclado = new Scanner(System.in);
        System.out.print("O que deseja: ");
        menu = teclado.nextInt();


        switch (menu) {
            case 1: {
                System.out.println("SOMA");
                System.out.print("Primeiro valor: ");
                n1 = teclado.nextInt();
                System.out.print("Segundo valor: ");
                n2 = teclado.nextInt();
                System.out.println("Resultado da soma = " + (n1 + n2));
                break;
            }
            case 2: {
                System.out.println("SUBTRAÇÃO");
                System.out.print("Primeiro valor: ");
                n1 = teclado.nextInt();
                System.out.print("Segundo valor: ");
                n2 = teclado.nextInt();
                System.out.println("Resultado da subtração = " + (n1 - n2));
                break;
            }
            case 3: {
                System.out.println("DIVISÃO");
                System.out.print("Primeiro valor: ");
                n1 = teclado.nextInt();
                System.out.print("Segundo valor: ");
                n2 = teclado.nextInt();
                System.out.println("Resultado da divisão = " + (n1 / n2));
                break;
            }
            case 4: {
                System.out.println("MULTIPLICAÇÃO");
                System.out.print("Primeiro valor: ");
                n1 = teclado.nextInt();
                System.out.print("Segundo valor: ");
                n2 = teclado.nextInt();
                System.out.println("Resultado da multiplicação = " + (n1 * n2));
                break;
            }
            case 5: {
                System.out.println("Saindo...");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("ERRO!");
                break;
            }
        }
    }
}
