package com.simeoreig.lab3;

import java.util.Scanner; // Importem la llibreria scanner del paquet util 

public class TestPrimers {

	public static void main(String[] args) { // main es el metode que crida el Sistema Operatiu (SO) quan executarem aquest programa

		boolean esPrimer;
		long startNanoTime;
		double elapsedTime;
		long numeroACalcular;

		//Instanciem un objecte de tipus Scanner i al constructor li diem que farem servir el teclat com entrada (entrada estandard)
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Posa el número que vols saber si es primer o compost, 1 per a sortir");

			numeroACalcular = sc.nextLong(); // Demanem per teclat (System.in) un numero de tipus Long

			startNanoTime = System.nanoTime(); // Guardem el temps en nanoSegons
			esPrimer = Primers.esNumeroPrimer_v1(numeroACalcular); // Cridem un metode static de la classe Prime
			elapsedTime = (System.nanoTime() - startNanoTime); //Calculem la diferencia

			System.out.printf("%20d\t%s\t%20.3f ms%n", numeroACalcular, esPrimer ? "primer" : "compost", elapsedTime * 1.0e-6);

		} while (numeroACalcular > 1);

		sc.close();
		
		System.out.println("Programa finalitzat;");

	}

}
