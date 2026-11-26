package unidad03.ejemplos.excepciones;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Persona p1 = new Persona("Vladi", 30, 1.79);
		
		do {
			p1.setNombre(null);
		}while(p1.getNombre() != null);
		
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		Math.sqrt(0);
		
	}
	
	public static void metodo1() {
		
	}

}
