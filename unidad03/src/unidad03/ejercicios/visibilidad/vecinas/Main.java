package unidad03.ejercicios.visibilidad.vecinas;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente cc1 = new CuentaCorriente("11111111A", "Pepe");
		// saldo no es visible
		//		cc1.saldo = 0.0;
		
		// dni si es visible
		cc1.dni = "22222222B";

	}

}
