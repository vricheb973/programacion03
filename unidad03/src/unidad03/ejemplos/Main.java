package unidad03.ejemplos;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int a = 1;
		int b = a;

		Persona p1 = new Persona("Pepe", 30, 1.79);
		Persona p2 = new Persona("Ramón", 30, 1.79);
		
		p1.saludar();
		
		p1.cambiarNombre("");
		p1.cambiarNombre("Roberto");
		
		p1.saludar();
		
		
	}

}
