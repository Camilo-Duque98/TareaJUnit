package net.codejava;

public class ComprarClass {
	
	static public int CafeLeche = 500;
	static public int Capuccino = 600;
	static public int Mocaccino = 700;
	static public int CafeCortado = 300;
	
	public static int getCafeLeche() {
		return CafeLeche;
	}
	public static int getCapuccino() {
		return Capuccino;
	}
	public static int getMocaccino() {
		return Mocaccino;
	}
	public static int getCafeCortado() {
		return CafeCortado;
	}
	//------------------------los set-----------------------------------------
	public static boolean setCafeLeche(int CafeLecheInt) {
		boolean flag = true;
		
		if(CafeLecheInt>=500) {
			flag = true;
		}
		else {
			flag = false;
		}
		
		return flag;
		
	}
	
	public static boolean setCapuccino(int CapuccinoInt) {
		boolean flag = true;
		
		if(CapuccinoInt >= 600) {
			flag = true;
		}
		else {
			flag = false;
		}
		return flag;
	}
	
	public static boolean setMocaccino(int MocaccinoInt) {
		boolean flag = true;
		
		if(MocaccinoInt >=700) {
			flag = true;
		}
		else {
			flag = false;
		}
		return flag;
	}
	
	public static boolean setCafeCortado(int CafeCortadoInt) {
		boolean flag = true;
		
		if(CafeCortadoInt >= 300) {
			flag = true;
		}
		else{
			flag = false;
		}
		return flag;
	}

}
