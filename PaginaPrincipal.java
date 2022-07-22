package net.codejava;

import java.util.Scanner;

public class PaginaPrincipal {
	
	public void getPaginaPrincipal() {

		InventoryClass inventario = new InventoryClass();
		ComprarClass Comprar = new ComprarClass();
		boolean flag = true;
		String Compra="";
		
		while(flag==true) {
			System.out.println("Ingrese alguna de las opciones");
			System.out.println("1- Agregar inventario.");
			System.out.println("2- Verificar inventario.");
			System.out.println("3- Comprar bebida.");
			System.out.println("4- Salir.");
			System.out.print("Ingrese una opcion: ");
			Scanner input = new Scanner(System.in);
			int option= input.nextInt();
			switch(option) {
				case 1: 
					System.out.println("Seleccione que desea agregar al inventario:");
					System.out.println("1- Cafe.");
					System.out.println("2- Leche.");
					System.out.println("3- Chocolate.");
					System.out.println("4- Azucar.");
					System.out.print("Ingrese una opcion: ");
					int Opcion = input.nextInt();
					System.out.print("Ingrese una cantidad: ");
					int Cantidad = input.nextInt();
					inventario.addInventory(Opcion,Cantidad);
					break;
				case 2:
					inventario.getInventory();
					break;
				case 3:
					Compra = inventario.Comprar();
					System.out.println(Compra);
					break;
				case 4:
					flag=false;
					System.out.println();
					break;
				default:
					System.out.println("Ingrese un valor correcto por favor");
			}
			System.out.println("---------------------------------------------------------------------------------------------------------");
			
		}
		
	}
	
}
