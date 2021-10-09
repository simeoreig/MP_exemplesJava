import java.util.Scanner;

public class ArraysJava {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] sistemesOp = { "linux", "Windows", "Mac", "freeBSD", "Solaris" };
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

		String arrayAlumnes[];
		int numeroAlumnes = 0;

		System.out.printf("El numero d'elements es de %d i el quart es %s", sistemesOp.length, sistemesOp[3]);

		// Recorrem l'array a la forma 'C'
		for (int i = 0; i < sistemesOp.length; i++) {
			System.out.println(sistemesOp[i]);
		}

		// Recorrem l'array amb un external for-each loop iterator
		for (String i : sistemesOp) {
			System.out.println(i);
		}

		// Iterem una matriu (array o vector multidimensional)
		for (int i = 0; i < myNumbers.length; ++i) {
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}

		// Anem a afegir dades a l'array srrayAlumnes;

		System.out.print("Quants alumnes hi ha al grup?");
		numeroAlumnes = scanner.nextInt();

		arrayAlumnes = new String[numeroAlumnes];

		for (int i = 0; i < numeroAlumnes; i++) {

			System.out.printf("Posa el nom de l'alumne numero %d", i + 1);
			String nomAlumne = scanner.next();
			arrayAlumnes[i] = nomAlumne;

		}

		// Recorrem l'array amb un external for-each loop iterator
		for (String nom : arrayAlumnes) {
			System.out.printf("%s,",nom);
		}
		
		

	}

}
