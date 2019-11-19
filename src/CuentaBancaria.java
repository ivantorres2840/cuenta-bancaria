import java.util.Scanner;

public class CuentaBancaria {
	
	private String nombre;
	private String entidad;
	private String oficina;
	private String codigocontrol;
	private String numerocuenta;
	
	private double saldo;
	
	
	private CuentaBancaria() {
		nombre="";
		entidad="";
		oficina="";
		codigocontrol="";
		numerocuenta="";
		
		saldo=0;
		
		
		
	}
		

		private CuentaBancaria(String nombre, String entidad, String oficina, String codigocontrol, String numerocuenta,
				double saldo) {
			
		this.nombre=nombre;
		this.entidad=entidad;
		this.oficina=oficina;
		this.codigocontrol=codigocontrol;
		this.numerocuenta=numerocuenta;
		this.saldo=saldo;
		
			
			
			
			
		}

		private CuentaBancaria(String nombre, String entidad, String oficina, String codigocontrol, String numerocuenta) {
			
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
			this.saldo+=ingresar;
		}
		
		public void retirarIngreso() {
			int retirar=0;
			Scanner leer = new Scanner(System.in);
			System.out.println("Dime un cantidad a retirar");
			retirar=leer.nextInt();
			this.saldo-=retirar;
		}
		
		public void mostrarCuenta() {
			System.out.println(this.entidad + this.oficina + this.codigocontrol+ this.numerocuenta);
		}
		
		public void mostrarSaldo() {
			System.out.println(this.saldo);
		}

		
		
		public void Titular() {
			if (this.nombre.length()>70) {
				System.out.println("debes escribir un nombre menor de 20 caracteres");
			}
		}
		
		public void ComprobarEntidad() {
			if(this.entidad.length()>4) {
				System.out.println("Debes escribir 4 numeros");
			}
		}
		
		public void ComprobarOficina() {
			if (this.oficina.length()>4) {
				System.out.println("Debes escribir 4 numeros");
			}
		}
		public void ComprobarCuenta() {
			if (this.numerocuenta.length()>10) {
				System.out.println("Debes escribir 10 numeros");
			}
		}
		
		public void ComprobarCodigo() {
			int num=0;
			int num1=0;
			int num2=0;
			int num3=0;
			num=Integer.parseInt(this.entidad.substring(0, 1))*4;
			num1=Integer.parseInt(this.entidad.substring(1, 2))*8;
			num2=Integer.parseInt(this.entidad.substring(2, 3))*5;
			num3=Integer.parseInt(this.entidad.substring(3, 4))*10;
			
			int num4=0;
			int num5=0;
			int num6=0;
			int num7=0;
			
			num4=Integer.parseInt(this.oficina.substring(0, 1))*9;
			num5=Integer.parseInt(this.oficina.substring(1, 2))*7;
			num6=Integer.parseInt(this.oficina.substring(2, 3))*3;
			num7=Integer.parseInt(this.oficina.substring(3, 4))*6;
			
			int total=0;
			int resto=0;
			int cod1=0;
			total=num1+num2+num3+num4+num5+num6+num7;
			resto=total%11;
			cod1=11-resto;
			
			if (cod1==10) {
				cod1=1;
			}
			if (cod1==11) {
				cod1=0;
			}
			
			
			int num8=0;
			int num9=0;
			int num10=0;
			int num11=0;
			int num12=0;
			int num13=0;
			int num14=0;
			int num15=0;
			int num16=0;
			int num17=0;
			
			num8=Integer.parseInt(this.numerocuenta.substring(0, 1))*1;
			num9=Integer.parseInt(this.numerocuenta.substring(1, 1))*2;
			num10=Integer.parseInt(this.numerocuenta.substring(2, 2))*4;
			num11=Integer.parseInt(this.numerocuenta.substring(3, 3))*8;
			num12=Integer.parseInt(this.numerocuenta.substring(4, 4))*5;
			num13=Integer.parseInt(this.numerocuenta.substring(5, 5))*10;
			num14=Integer.parseInt(this.numerocuenta.substring(6, 6))*9;
			num15=Integer.parseInt(this.numerocuenta.substring(7, 7))*7;
			num16=Integer.parseInt(this.numerocuenta.substring(8, 8))*3;
			num17=Integer.parseInt(this.numerocuenta.substring(9, 9))*6;
			
			
			int total2=0;
			int resto2=0;
			int cod2=0;
			total2=num8+num9+num10+num11+num12+num13+num14+num15+num16+num17;
			resto2=total2%11;
			cod2=11-resto2;
			
			if (cod2==10) {
				cod2=1;
			}
			if (cod2==11) {
				cod2=0;
			}
			
			
			
			Integer.toString(cod1);
			Integer.toString(cod2);
			
			this.codigocontrol=cod1+" "+ cod2;
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	

		
