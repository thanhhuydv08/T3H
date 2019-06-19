package lamda;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BT1_3 {
	static Interface_BT1_3 bt1_3;
	static	Scanner scanner = new Scanner(System.in);
	static Double a1,b1;
public  static void main(String[] args) {
	//System.out.println("Dien tich hinh chu nhat :"+sHcn());
	//System.out.println("Dien tich hinh tron :"+sHt());
	/*
	 *  input tu ban phim
	 */

		System.out.println("Nhap ban kinh hinh tron :");
		a1 = scanner.nextDouble();
		System.out.println("Dien tich hinh tron co ban kinh "+a1+":"+sHt());
	
	
	
}
public static double sHcn() {
	double sHcn;
	bt1_3 = (a,b)-> a*b;
	sHcn=bt1_3.Vung(a1, b1);
	return sHcn;
}

public static double sHt() {
	double sTron;
	
	bt1_3 = (a,b)-> a*b;
	sTron=bt1_3.Vung(a1, a1)*3.14;
	return sTron;
}
}
