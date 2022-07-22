package net.codejava;

public class BuyClass {
	public static int Valor=0;
	public static int Pago=0;
	public static boolean flag = true;
	public static int getValor() {
		return Valor;
	}
	public static void setValor(int Value) {
		Valor = Value;
	}
	public static void setTotal(int Value) {
		Valor=Value;
		System.out.println(Valor);
	}
	public static void setResponse(String Compra) {
		InventoryClass Inventario = new InventoryClass();
		flag=true;
		if(Compra.equals("CL")) {//Si es que es igual a cafe con leche
			Inventario.setCafe(-2);
			Inventario.setLeche(-4);
			Inventario.setAzucar(-2);
			}
		else if(Compra.equals("CC")) {//Si es que es igual a capuccino
			Inventario.setLeche(-2);
			Inventario.setCafe(-3);
			Inventario.setAzucar(-2);
			}
		else if(Compra.equals("MCC")) {
			Inventario.setLeche(-2);
			Inventario.setCafe(-2);
			Inventario.setChocolate(-5);
			Inventario.setAzucar(-2);
			}
		else if(Compra.equals("CCT")) {
			Inventario.setCafe(-3);
			Inventario.setAzucar(-2);
			}
		
	}
	
}
