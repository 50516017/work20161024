package calculation;

import java.util.Scanner;

public class Calculation_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Input NUmber m>");
		int m=Integer.parseInt(scan.next());
		System.out.print("input n>");
		int n=Integer.parseInt(scan.next());
		
		Calculation_lib clib = new Calculation_lib(m,n);
		System.out.println("m+n="+clib.getPlus());
		System.out.println("m-n="+clib.getMinus());
		System.out.println("m*n="+clib.getMulti());
		System.out.println("m/n="+clib.getDiv());
		System.out.println("m%n="+clib.getMod());
	}
	


}
