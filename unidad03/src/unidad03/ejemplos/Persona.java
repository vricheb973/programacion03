package unidad03.ejemplos;

public class Persona {
	
	private String nombre;
	private Integer edad;
	private Double estatura;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, Integer edad, Double estatura) {
		//Siempre que referenciemos a un atributo usaremos this
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	public void saludar() {
		System.out.printf("Hola, me llamo %s \n", this.nombre);
	}
	
	public void cambiarNombre(String nombre) {
		if(nombre.length() == 0) {
			System.out.println("No puedes introducir un nombre vacío.");
		}
		else {
			this.nombre = nombre;
		}
	}
	
}
