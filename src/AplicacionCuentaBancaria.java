import java.util.Scanner;

public class AplicacionCuentaBancaria {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		Menu menu = new Menu();
		int opcion = 0;

		String nombre = "";
		String entidad = "";
		String oficina = "";
		String numcuenta = "";
		String codigo = "";
		CuentaBancaria cuenta;

		do {
			System.out.println("Introduce un nombre ");
			nombre = leer.nextLine();
			System.out.println("Introduce la entidad (4 digitos)");
			entidad = leer.nextLine();
			System.out.println("Intoruce la oficina (4 digitos)");
			oficina = leer.nextLine();
			System.out.println("Introduce el codigo (2 digitos)");
			codigo = leer.nextLine();
			System.out.println("Introduce el numero de cuenta (10 digitos)");
			numcuenta = leer.nextLine();
			cuenta = new CuentaBancaria(nombre, entidad, oficina, codigo, numcuenta);
		} while (!cuenta.ComprobarCodigo());

		do {
			opcion = menu.pintaMenu();
			switch (opcion) {
			case 1:
				cuenta.mostrarCuenta();
				break;
			case 2:
				cuenta.mostrartitular();
				break;
			case 3:
				cuenta.mostrarEntidad();
				break;
			case 4:
				cuenta.mostraroficina();
				break;
			case 5:
				cuenta.mostrarnumcuenta();
				break;
			case 6:
				cuenta.mostrarcodigo();
				break;
			case 7:
				cuenta.hacerIngreso();
				break;
			case 8:
				cuenta.retirarIngreso();
				break;
			case 9:
				cuenta.mostrarSaldo();
				break;
			case 10:
				System.out.println("Adios");
				break;
			}
		} while (opcion != 10);

	}

}
