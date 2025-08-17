/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Exercicio {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        /*
        System.out.println("---------------------------");
        System.out.println("Exercicio de Fixação 01");
        System.out.println("___________________________");
        System.out.printf("Qual o seu nome: ");
        String nome = scanner.next();
        System.out.printf("\nQual a sua idade: ");
        int idade = scanner.nextInt();
        System.out.printf("Ola, %s sua idade é %s",nome, idade);

        
        System.out.println("---------------------------");
        System.out.println("Exercicio de Fixação 02");
        System.out.println("___________________________");
        System.out.println("Digite o tamanho de um dos lados do quadrado: ");
        var tam = scanner.nextInt();
        System.out.printf("A area do quadrado e %s m²", tam * tam);
        
        */
        
        System.out.println("---------------------------");
        System.out.println("Exercicio de Fixação 03");
        System.out.println("___________________________");
        System.out.println("Digite as infomacoes solicitadas:");
        
        System.out.println("######  1 Pessoa  ###### ");
        System.out.println("Nome: ");
        var nomep1 = scanner.next();
        System.out.println("Idade: ");
        var idadep1 = scanner.nextInt();
        
        System.out.println("---------------------------");
        
        System.out.println("######  2 Pessoa  ###### ");
        System.out.println("Nome: ");
        var nomep2 = scanner.next();
        System.out.println("Idade: ");
        var idadep2 = scanner.nextInt();
        
        if(idadep1 > idadep2){
            System.out.printf("A diferenca entre %s e %s e %s anos!", nomep1, nomep2, idadep1 - idadep2);
        }else {
            System.out.printf("A diferenca entre %s e %s e %s anos!", nomep1, nomep2, idadep2 - idadep1);
        }
    }
}
