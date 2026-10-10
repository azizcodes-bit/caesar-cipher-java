package caesar_Chiffre;
import java.util.Scanner;

public class CaesarChiffre {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		int verschiebung = 0;
		int auswahl;
		String klartext = "";
		String geheimtext = "";
		
		do {
			System.out.println("(1) Eingabe Klartext");
			System.out.println("(2) Eingabe Geheimtext");
			System.out.println("(3) Vershiebung ");
			System.out.println("(4) Verschluesseln ");
			System.out.println("(5) Entschluesseln");
			System.out.println("(6) Entschluesseln Durchlauf");
			System.out.println("(7) Ende ");
			System.out.println("Auswahl :");
			auswahl = scanner.nextInt();
			switch (auswahl) {
				case 1 :
					scanner.nextLine();
					System.out.println("Klartext");
					klartext = scanner.nextLine();
					break;
				case 2 : 
					scanner.nextLine();
					System.out.println("Geheimtext");
					geheimtext = scanner.nextLine();
					break;
				case 3 :
					System.out.println("Verschiebung :");
					verschiebung  = scanner.nextInt();
					break;
				case 4 : 	
					geheimtext = verschluesseln(klartext,verschiebung);
					System.out.println("Geheimtext :"+ geheimtext);
					break;
				case 5 : 
					klartext = entschluesseln(geheimtext,verschiebung);
					System.out.println("Klartext :"+ klartext);
					break;
				case 6 : 	
					for (int i = 1 ; i < 26 ; i++  ) {
						System.out.println(i + ": " + entschluesseln(geheimtext, i));	
					}
					break ;
				case 7 :
					System.out.println("Program beendet.");
			
			}		
			}while (auswahl != 7);
					
		
	}
	public static String verschluesseln ( String text , int verschiebung ) {
		String res = "";
		int code ;
		for (int i = 0 ; i < text.length();i++) {
			char buchstabe = text.charAt(i);
			
			
			if (buchstabe >= 'a' && buchstabe <= 'z') {
				code = (int) buchstabe + verschiebung;
			

			    if (code > 122) {
			        code = code - 26;
			    }
			    res+= (char) code;

			} else if (buchstabe >= 'A' && buchstabe <= 'Z') {
				code = (int) buchstabe + verschiebung;
			

			    if (code > 90) {
			        code = code - 26;
			    }
			    res+= (char) code;

			}else {
			    res += buchstabe;
			}
		}
		return res;
	
	}
	public static String entschluesseln ( String text , int verschiebung ) {
		String res = "";
		int code ;
		for (int i = 0 ; i < text.length();i++) {
			
			char buchstabe = text.charAt(i);
			
			
			if (buchstabe >= 'a' && buchstabe <= 'z') {
				code = (int) buchstabe - verschiebung;
			

			    if (code < 97) {
			        code = code + 26;
			    }
			    res+= (char) code;

			} else if (buchstabe >= 'A' && buchstabe <= 'Z') {
				code = (int) buchstabe - verschiebung;
			

			    if (code < 65) {
			        code = code + 26;
			    }
			    res+= (char) code;

			}else {
			    res += buchstabe;
			}
		
		
		}return res;
	}
}
		
	



