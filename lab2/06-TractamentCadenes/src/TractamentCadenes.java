
public class TractamentCadenes {

	static final String CENTINELLA_INICI = "cadena";
	
	
	public static void main(String[] args) {

		
		String cadena = "cadena de text molt important";

		//Cadena en majúscula
		System.out.printf("La cadena en majúscula %s \n",cadena.toUpperCase());
		
		//Buscar un caràcter
		System.out.printf("La primera t es troba a %d \n",cadena.indexOf('t'));
		System.out.printf("L'última t es troba a %d \n",cadena.lastIndexOf('t'));
		
		//Subcadenes
		System.out.printf("Un troç de la cadena: '%s' \n",cadena.substring(15,29));
		
		//Prefixes i sufixes
		if (cadena.startsWith(CENTINELLA_INICI)) {
			System.out.println("La cadena comença amb '" + CENTINELLA_INICI + "'");
		}
		
		if (!cadena.endsWith(CENTINELLA_INICI)) {
			System.out.println("La cadena no acaba amb " + CENTINELLA_INICI + "'");
		}

		
		
	}

}
