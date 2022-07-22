package net.codejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryClass {
	public static int Cafe=0;
	public static int Leche=0;
	public static int Chocolate=0;
	public static int Azucar=0;
	
	public static int getCafe() {
		return Cafe;
	}
	public static int getLeche() {
		return Leche;
	}
	public static int getChocolate() {
		return Chocolate;
	}
	public static int getAzucar() {
		return Azucar;
	}
	public void getInventory() {
		System.out.println("Gramos de Cafe: " + getCafe());
		System.out.println("Gramos de Leche: " + getLeche());
		System.out.println("Gramos de Chocolate: " + getChocolate());
		System.out.println("Gramos de Azucar: " + getAzucar());
	}
	
	public void addInventory(int opcion, int cantidad) {
		if (opcion == 1) {
			setCafe(cantidad);
		}else if (opcion == 2) {
			setLeche(cantidad);
		}else if (opcion == 3) {
			setChocolate(cantidad);
		}else if (opcion == 4) {
			setAzucar(cantidad);
		}
	}
	
	//Agregando ingredientes
	public static void setCafe(int addCafe) {
		
		Cafe+=addCafe;
	}
	public static void setLeche(int addLeche) {
		Leche+=addLeche;
	}
	public static void setChocolate(int addChocolate) {
		Chocolate+=addChocolate;
	}
	public static void setAzucar(int addAzucar) {
		Azucar+=addAzucar;
	}//
	
	
	
	//---------------------------Comprar------------------------------------------------
	public static String Comprar() {
		
		int choice, Monto, Vuelto;
		boolean flag = true, boleano;
		String Response="";
		
		ComprarClass Compra = new ComprarClass();
		BuyClass Confirmar =  new BuyClass();
		while(flag == true) {
			System.out.println("Estamos en Comprar");
			System.out.println("\tQue desea comprar");
			System.out.println("1-Cafe con leche: $500");
			System.out.println("2-Capuccino: $600");
			System.out.println("3-Mocaccino: $700");
			System.out.println("4-Cafe Cortado: $300");
			System.out.println("5-Volver al menú");
			System.out.println("Ingrese un valor: ");
			Scanner election = new Scanner(System.in);
			choice = election.nextInt();
			try {
				switch(choice) {
					case 1: 
						if( Cafe>2 && Leche > 4 && Azucar > 2) {
							System.out.print("Ingrese el monto a pagar por cafe por leche: ");
							Monto = election.nextInt();
							boleano = Compra.setCafeLeche(Monto);
							if(boleano == true) {
								Confirmar.setResponse("CL");
								Vuelto = Monto - 500;
								
								System.out.println("Su café con leche está listo, el vuelto es de "+Vuelto+" pesos");
								flag = false;
								Response = "Su café con leche está listo, el vuelto es de "+Vuelto+" pesos";
								
							}else {
								System.out.println("Ingrese un monto valido");
							}
						}else {
							System.out.println("No quedan cafes con Chocolate");
						}
						break;
					case 2:
						if( Cafe>3 && Leche > 2 && Azucar > 2) {
							System.out.print("Ingrese el monto a pagar por capuccino: ");
							Monto = election.nextInt();
							boleano = Compra.setCapuccino(Monto);
							if(boleano == true) {
								Confirmar.setResponse("CC");
								Vuelto =  Monto - 600;
								System.out.println("Su Capuccino está listo, el vuelto es de "+ Vuelto+" pesos");
								flag = false;
								Response= "Su Capuccino está listo, el vuelto es de "+ Vuelto+" pesos";
							}else {
								System.out.println("Ingrese un monto valido");
							}
						}else {
							System.out.println("No quedan cafes con Chocolate");
						}
						break;
					case 3:
						if(Leche > 2 && Cafe > 2 && Chocolate > 5 && Azucar > 2 ) {
							System.out.print("Ingrese el monto a pagar por Mocaccino: ");
							Monto = election.nextInt();
							boleano = Compra.setMocaccino(Monto);
							if(boleano == true) {
								Confirmar.setResponse("MCC");
								Vuelto = Monto - 700; 
								System.out.println("Su Moccaccino está listo, el vuelto es de "+Vuelto+" pesos");
								flag = false;
								Response = "Su Moccaccino está listo, el vuelto es de "+Vuelto+" pesos";
							}
							else {
								System.out.println("Ingrese un monto valido");
							}
						}else {
							System.out.println("No quedan Mocaccino");
						}
						break;
					case 4:
						if(Cafe > 2 && Azucar > 2) {
							System.out.print("Ingrese el monto a pagar: ");
							Monto = election.nextInt();
							boleano = Compra.setCafeCortado(Monto);
							if(boleano == true) {
								Confirmar.setResponse("CCT");
								Vuelto = Monto - 300;
								System.out.println("Su Cafe cortado está listo, el vuelto es de "+Vuelto+" pesos");
								flag = false;
								Response = "Su Cafe cortado está listo, el vuelto es de "+Vuelto+" pesos";
							}else {
								System.out.println("Ingrese un monto valido");
							}}
						else {
							System.out.println("No quedan café cortado");
							}
					case 5:
						flag = false;
					default:
						System.out.println("No queda de ese estilo de cafe");
				}
			}catch(Exception e){
				System.out.println("Ingrese una entrada permitida por favor");
			}
			System.out.println("---------------------------------------------------------------------------------------------------------");
			
		}
		
		return Response;
		
		
	}
}
