package holaAlumne;

import java.util.Scanner;

public class PreguntaNom {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Posa el teu nom : ");		
		String nom = scanner.next();

		System.out.print("Posa l'alçada en metres (ex 1.80) : ");		
		float alcada = scanner.nextFloat();
			
        //Sino veus la ç molt probablement no tens la codificació UTF-8
		System.out.println("Nom:" + nom + ", Alçada" + alcada);
			
		scanner.close();
		
	}

}
