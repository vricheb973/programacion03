package unidad03.ejercicios.gta6;

public class Main {

	public static void main(String[] args) {

		ProtagonistaGTA p1 = new ProtagonistaGTA("Jason");
		ProtagonistaGTA p2 = new ProtagonistaGTA("Lucía");
		
		p1.cometerDelito(1000); // suma 1 estrella
		p2.cometerDelito(300);

		p2.cometerDelito(1300);
		
		p1.mostrarFichaPolicial();

		p1.cometerDelito(20); // suma 1 estrella
		p1.cometerDelito(30); // suma 1 estrella
		
		p1.mostrarFichaPolicial();
		
		p1.sobornarPolicia(3); // baja 3 estrella (no tiene dinero)

	}

}
