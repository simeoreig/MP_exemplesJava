package com.simeoreig.lab3;

public class Primers {

	
	public static boolean esNumeroPrimer_v1(long num) {

		int numeroDivisors = 0;

		// El número u és NO primer per conveni, encara que només es divisible per
		// ell mateix i per u solament.
		if (num >= 2) {

			for (long i = 1; i <= num; i++) {
				if (num % i == 0) {
					numeroDivisors++;
				}
			}

			return (numeroDivisors == 2);

		} else {
			return false;
		}

	}

}
