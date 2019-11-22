import java.util.Scanner;

public class CuentaBancaria {
	
	private String nombre;
	private String entidad;
	private String oficina;
	private String codigocontrol;
	private String numerocuenta;
	private double saldo;
	
	
	CuentaBancaria() {
		nombre="";
		entidad="";
		oficina="";
		codigocontrol="";
		numerocuenta="";
		saldo=0;
		
		
		
	}
		

		public CuentaBancaria(String nombre, String entidad, String oficina, String codigocontrol, String numerocuenta,
				double saldo) {
		this.nombre=nombre;
		this.entidad=entidad;
		this.oficina=oficina;
		this.codigocontrol=codigocontrol;
		this.numerocuenta=numerocuenta;
		this.saldo=saldo;
		
			
			
			
			
		}

		public CuentaBancaria(String nombre, String entidad, String oficina, String codigocontrol, String numerocuenta) {
			
			this.nombre=nombre;
			this.entidad=entidad;
			this.oficina=oficina;
			this.codigocontrol=codigocontrol;
			this.numerocuenta=numerocuenta;
			saldo=0;
			
		}	
			
		
		public void hacerIngreso() {
			int ingresar=0;
			Scanner leer = new Scanner(System.in);
			System.out.println("Dime un cantidad a ingresar");
			ingresar=leer.nextInt();
			if (ingresar<=0) {
				System.out.println("Debes introducir un numero mayor que 0");
			}else {
			this.saldo+=ingresar;
			}
		}
		
		public void retirarIngreso() {
			int retirar=0;
			Scanner leer = new Scanner(System.in);
			System.out.println("Dime un cantidad a retirar");
			retirar=leer.nextInt();
			if(retirar>this.saldo && retirar==0) {
				System.out.println("no puedes retirar mas dinero del que tienes o retirar 0");
			}else {
			this.saldo-=retirar;
			}
		}
		
		public void mostrarCuenta() {
			System.out.println(this.entidad +" "+ this.oficina + " " + this.codigocontrol+" " + this.numerocuenta);
		}
		
		public void mostrarSaldo() {
			System.out.println(this.saldo);
		}

		public void mostrarEntidad() {
			System.out.println(this.entidad);
		}
		
		public void mostraroficina() {
			System.out.println(this.oficina );
		}
		
		public void mostrarnumcuenta() {
			System.out.println(this.numerocuenta);
		}
		public void mostrarcodigo() {
			System.out.println(this.codigocontrol);
		}
		public void mostrartitular() {
			System.out.println(this.nombre);
		}
		
		
		
		
		public boolean ComprobarCodigo() {
			int num=0;
			int num1=0;
			
			
			
			
			num=Integer.parseInt(this.entidad.substring(0, 1))*4;
			num+=Integer.parseInt(this.entidad.substring(1, 2))*8;
			num+=Integer.parseInt(this.entidad.substring(2, 3))*5;
			num+=Integer.parseInt(this.entidad.substring(3, 4))*10;
			
			
			
			num+=Integer.parseInt(this.oficina.substring(0, 1))*9;
			num+=Integer.parseInt(this.oficina.substring(1, 2))*7;
			num+=Integer.parseInt(this.oficina.substring(2, 3))*3;
			num+=Integer.parseInt(this.oficina.substring(3, 4))*6;
			
			int resto=0;
			int cod1=0;
			
			resto=num%11;
			cod1=11-resto;
			
			if (cod1==10) {
				cod1=1;
			}
			if (cod1==11) {
				cod1=0;
			}
			
			
			/*
			 * 
			 */
			
			num1=(Integer.parseInt(this.numerocuenta.substring(0, 1)))*1;
			num1+=(Integer.parseInt(this.numerocuenta.substring(1, 2)))*2;
			num1+=(Integer.parseInt(this.numerocuenta.substring(2, 3)))*4;
			num1+=(Integer.parseInt(this.numerocuenta.substring(3, 4)))*8;
			num1+=(Integer.parseInt(this.numerocuenta.substring(4, 5)))*5;
			num1+=(Integer.parseInt(this.numerocuenta.substring(5, 6)))*10;
			num1+=(Integer.parseInt(this.numerocuenta.substring(6, 7)))*9;
			num1+=(Integer.parseInt(this.numerocuenta.substring(7, 8)))*7;
			num1+=(Integer.parseInt(this.numerocuenta.substring(8, 9)))*3;
			num1+=(Integer.parseInt(this.numerocuenta.substring(9, 10)))*6;
			
			
			int resto2=0;
			int cod2=0;
			resto2=num1%11;
			cod2=11-resto2;
			
			if (cod2==10) {
				cod2=1;
			}
			if (cod2==11) {
				cod2=0;
			}
			
			
			
			String codtotal="";
			
			
			codtotal=Integer.toString(cod1)+ Integer.toString(cod2);
			
			
			
			if(codtotal.equalsIgnoreCase(this.codigocontrol) && this.nombre.length()<18 && this.entidad.length()<5 && this.oficina.length()<5 && this.numerocuenta.length()<11 && this.codigocontrol.length()<3) {
				return true;
			}else {
				return false;
			}
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	

		
