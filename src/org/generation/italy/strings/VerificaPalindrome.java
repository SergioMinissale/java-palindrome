package org.generation.italy.strings;
import java.util.Scanner;

public class VerificaPalindrome {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci la parola: ");
		
		String parola = scanner.nextLine();
		String revParola = "";
		//parola al contrario
		for(int i = parola.length() - 1; i >= 0; i--) {
			revParola = revParola + parola.charAt(i);	
		}
		System.out.println("La parola al contrario è: " + revParola);
			
		if(revParola.equals(parola)) {
				System.out.println("\nLa parola è palindroma: " + parola + " = " + revParola);		
		} else {
				System.out.println("\nLa parola non è palindroma: " + parola + " != " + revParola);
		}
		
	scanner.close();
}
}
