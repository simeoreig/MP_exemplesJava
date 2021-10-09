package com.simeoreig.lab3;

public class TestPrimers {

	public static void main(String[] args) {

		boolean esPrimer = false;
		long startNanoTime;
		double elapsedTime;
		long[] arrayProves = { 1, 2, 3, 4, 25, 96, 97, 2017, 2026, 19902013, 19902016, 4275912661L, 4275912996L,
				9223372024852248004L, 9223372030926249001L, 9223372036854775643L, 9223372036854775707L };

		// Recorrem l'array de longs amb un for, podríem emprar un for 'classic' també
		// Ja tenim un joc de proves més extens i ens permet veure que per números grans esNumeroPrimer_v1 
		// no acabarà ja que serà un problema intractable
		
		for (long numActual : arrayProves) {

			startNanoTime = System.nanoTime(); // Start timer
			esPrimer = Primers.esNumeroPrimer_v1(numActual);
			elapsedTime = (System.nanoTime() - startNanoTime);

			System.out.printf("%20d\t%s\t%20.3f ms%n", numActual, esPrimer ? "primer" : "compost",
					elapsedTime * 1.0e-6);

		}

	}

}
