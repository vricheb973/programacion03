package unidad03.ejercicios.cuentaCorriente;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente cc1 = new CuentaCorriente("11111111A", "Pepe");
		cc1.ingresar(56);
		cc1.mostrarInfo();
		
		cc1.retirar(23);
		cc1.mostrarInfo();

	}

}
