import java.util.Scanner;

public class Menu {

	
	
	public Menu() {
		
	}
	
	public int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc=0;
		
		
		do {
		
		System.out.println("1. Ver el numero de cuenta completo");
		System.out.println("2. Ver el titular de la cuenta");
		System.out.println("3. Ver el codigo de la entidad");
		System.out.println("4. Ver el codigo de la oficina");
		System.out.println("5. Ver el numero de la cuenta");
		System.out.println("6. Ver los digitos de contro de la cuenta");
		System.out.println("7. Realizar un ingreo");
		System.out.println("8. Retirar efectivo");
		System.out.println("9. Consulto saldo");
		System.out.println("10. Salir");
		opc=leer.nextInt();
		}while(opc<1 || opc>10);
		
		
		
		return opc;
	}
	
	
}
