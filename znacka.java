import java.util.Scanner;
public class znacka {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
	System.out.println("Dobrodošel/la v zlati znački!");
	System.out.println("Izdelava programa: Jan Krneta & Eva Maurer \n \n \n");
	System.out.print("Kako ti je ime:\n Ime mi je ");
	String ime = scan.next();
	System.out.printf("Pozdravljen/a %s. Pa začniva s vajo.", ime);
	int napake = 0;
	
	//Tukaj se začne ena celica
	
	System.out.println("1. Kaj je statut društva? \n a) To je listina, ki določa: ime in sedež društva, namen in naloge, način včlanjevanja in prenehanja članstva, organe društva, sestavo organov, način volitve organov, pravice in dolžnosti, zastopanje društva, financiranje, način prenehanja, način zagotavljanja javnosti dela. \n b) Dokument, ki ureja pravila na intervenciji. \n c) Dokument, ki ureja pravila v zvezi.");
	System.out.print("Odgovor: ");
	char odgovor = scan.next().charAt(0);
	if(odgovor == 'a'){System.out.println("Odgovor je pravilen \n\n");} else {System.out.print("Pravilen odgovor je a."); napake++;}
	
	//Konec celice
	
	
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	}
}
