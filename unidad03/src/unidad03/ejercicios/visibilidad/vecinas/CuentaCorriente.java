package unidad03.ejercicios.visibilidad.vecinas;

public class CuentaCorriente {
	
	public String nombreTitular;
	String dni;
	private Double saldo;
	
	public CuentaCorriente() {
		this.saldo = 0.0;
	}
	
	public CuentaCorriente(String dni, String nombreTitular) {
		this.dni = dni;
		this.nombreTitular = nombreTitular;
		this.saldo = 0.0;
	}
	
	public void ingresar(double ingreso) {
		this.saldo += ingreso;
	}
	
	public void retirar(double retirada) {
		this.saldo -= retirada;
	}
	
	public void mostrarInfo() {
		System.out.printf("Nombre: %s \n", this.nombreTitular);
		System.out.printf("DNI: %s \n", this.dni);
		System.out.printf("Saldo: %.2f€ \n", this.saldo);
	}
}
