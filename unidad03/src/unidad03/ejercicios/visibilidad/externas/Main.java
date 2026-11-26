package unidad03.ejercicios.visibilidad.externas;

import unidad03.ejercicios.visibilidad.vecinas.CuentaCorriente;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente cc1 = new CuentaCorriente("11111111A", "Pepe");
		cc1.nombreTitular = "Vladi";
		
		//Ni dni ni saldo son visibles desde clases externas
//		cc1.dni = "";
//		cc1.saldo = 0.0;

	}

}
