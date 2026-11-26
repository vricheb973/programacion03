package unidad03.ejercicios.gta6;

public class ProtagonistaGTA {
	
	private String nombre;
	private Integer nivelBusqueda;
	private Double dinero;
	
	public ProtagonistaGTA() {
		this.nivelBusqueda = 0;
		this.dinero = 50.0;
	}
	
	public ProtagonistaGTA(String nombre) {
		this.nombre = nombre;
		this.nivelBusqueda = 0;
		this.dinero = 50.0;
	}
	
	public void cometerDelito(double dineroRobado) {
		this.dinero += dineroRobado;
		this.nivelBusqueda++;
		
		if(this.nivelBusqueda > 6) {
			this.nivelBusqueda = 6;
		}
	}
	
	public void sobornarPolicia(int estrellas) {
		if(this.nivelBusqueda == 0) {
			System.out.println("No puedes bajar de 0 estrellas!!");
		}
		else if(this.dinero < (estrellas * 500)) {
			System.out.printf("Necesitas más pasta para bajar %d estrellas! \n", estrellas);
		}
		else {
			this.nivelBusqueda -= estrellas;
		}
	}
	
	public void mostrarFichaPolicial() {
		System.out.printf("Nombre: %s \n", this.nombre);
		System.out.printf("Dinero: %.2f€ \n", this.dinero);
		dibujarEstrellas();
	}
	
	public void dibujarEstrellas() {
		System.out.print("Nivel búsqueda: ");
		for(int i=0; i<this.nivelBusqueda; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNivelBusqueda() {
		return nivelBusqueda;
	}

	public void setNivelBusqueda(Integer nivelBusqueda) {
		this.nivelBusqueda = nivelBusqueda;
	}

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}
	
	

}
