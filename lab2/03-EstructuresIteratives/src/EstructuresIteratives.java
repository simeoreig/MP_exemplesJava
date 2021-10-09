import java.util.Scanner;

public class EstructuresIteratives {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int edat = 0 ;
		
		
		//Exemple de do-while
		do {
			
			System.out.println ("Posa la teva edat : ");
			
			edat = scanner.nextInt();
			
		} while (edat < 0 || edat > 120 );
		
		
		// Exemple de if
		if (edat > 18)  {			
			System.out.printf("La teva edat es %d, ets major d'edat", edat);	
		} else {
			System.out.printf("La teva edat es %d, ets menor d'edat", edat);				
		}
		
		
		scanner.close();
		
	}

}
