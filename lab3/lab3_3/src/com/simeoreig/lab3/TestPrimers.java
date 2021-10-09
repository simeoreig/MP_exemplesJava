package com.simeoreig.lab3;

public class TestPrimers {

	public static void main(String[] args) {

		boolean esPrimer = false;	
		long startNanoTime;
		double elapsedTime;		
		long[] arrayProves = {1, 2, 3, 4, 25, 96, 97, 2017, 2026, 19902013, 19902016, 4275912661L, 4275912996L,
				9223372024852248004L, 9223372030926249001L, 9223372036854775643L, 9223372036854775707L};
		
		//Fem un petit joc de proves
		if (!Primers.comprovaLlistaConegudaPrimers_v1(Primers.primesFrom2two80k)) {
			System.err.println("Error, el mètode no calcula correctament els primers, sortim");
			System.exit(1);
		}
		
		for (long numActual: arrayProves) {
			
			startNanoTime = System.nanoTime(); // Start timer
			esPrimer = Primers.esNumeroPrimer_v3(numActual); 
			elapsedTime = (System.nanoTime() - startNanoTime);

			System.out.printf("%20d\t%s\t%20.3f ms%n", numActual, esPrimer? "primer":"compost", elapsedTime*1.0e-6);
			
		}

		System.out.println("Programa finalitzat;");
		
	}
		
}
