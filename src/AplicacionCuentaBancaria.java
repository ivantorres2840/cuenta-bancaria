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
		System.out.println("Introduce un nombre");
		nombre = leer.nextLine();
		System.out.println("Introduce la entidad");
		entidad = leer.nextLine();
		System.out.println("Intoruce la oficina");
		oficina = leer.nextLine();
		System.out.println("Introduce el codigo");
		codigo = leer.nextLine();
		System.out.println("Introduce el numero de cuenta");
		numcuenta = leer.nextLine();
		CuentaBancaria p = new CuentaBancaria(nombre, entidad, oficina, codigo, numcuenta);

		if (p.ComprobarCodigo()) {
			do {
				opcion = menu.pintaMenu();
				switch (opcion) {
				case 1:
					p.mostrarCuenta();
					break;
				case 2:
					p.mostrartitular();
					break;
				case 3:
					p.mostrarEntidad();
					break;
				case 4:
					p.mostraroficina();
					break;
				case 5:
					p.mostrarnumcuenta();
					break;
				case 6:
					p.mostrarcodigo();
					break;
				case 7:
					p.hacerIngreso();
					break;
				case 8:
					p.retirarIngreso();
					break;
				case 9:
					p.mostrarSaldo();
					break;
				case 10:
					System.out.println("Adios");
					break;
				}
			} while (opcion != 10);
		} else {
			System.out.println("el codigo no es correcto");
		}

	}

}
