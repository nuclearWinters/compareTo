/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.compareto;
import java.util.Scanner;
/**
 *
 * @author Armando
 */
public class CompareTo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena1;
        String cadena2;
        int valor;
        System.out.println("Ingresa el primer texto");
        cadena1 = entrada.nextLine();
        System.out.println("Ingresa el segundo texto");
        cadena2 = entrada.nextLine();
        valor = cadena1.compareTo(cadena2);
        if(valor == 0)
        {
            System.out.println("Los textos son iguales");
        }
        else if (valor < 0)
        {
            System.out.println("El primer texto es lexicográficamente MAYOR al segundo texto");
        }
        else
        {
            System.out.println("El primer texto es lexicográficamente MENOR al segundo texto");
        }
        System.out.println(cadena1.compareTo(cadena2));
    }    
}

