package unidad03.ejemplos.excepciones;

public class Persona {

	private Long id;
	private String nombre;
	private Integer edad;
	private Double estatura;
	
	private static Long ultimoId = 1L;

	public Persona() {

	}

	public Persona(String nombre, Integer edad, Double estatura) {
		this.id = ultimoId;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setEstatura(estatura);		
		ultimoId++;
	}

	public void saludar() {
		System.out.printf("Hola, me llamo %s \n", this.nombre);
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.length() <= 0) {
			throw new IllegalArgumentException("No puedes introducir un nombre nulo o vacío.");
		} 
		
		this.nombre = nombre;
	}

}
