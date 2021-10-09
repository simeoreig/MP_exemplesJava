package compararStrings;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String string1, string2 = "";

		System.out.println("Posa el primer string : ");
		string1  = scanner.next();

		System.out.println("Posa el segon string : ");
		string2  = scanner.next();
		
		// Aquesta comparació d'igualtat NO farà el que nosaltres esperem, per què? La solució a classe!!
		if (string1 == string2) {
			System.out.printf("Els string1:%s i string2:%s són IGUALS",string1,string2);
		} else {
			System.out.printf("Els string1:%s i string2:%s són DIFERENTS",string1,string2);
		}

		scanner.close();
	}

}
