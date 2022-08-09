package reto;

import java.util.*; 

public class CalculoTotal{
	public static void main(String[] args){
		System.out.println(CalcularIVA(240,21));
		System.out.println(CalcularIVA(250,0));
	}

	public static double CalcularIVA(double cantidad, int IVA){
		return cantidad + (IVA == 0? cantidad*0.21 : cantidad*IVA/100);
	}
}