import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tell me the price in US$");
		Scanner key = new Scanner(System.in);

		double price = key.nextDouble();

		System.out.println("How much cash was tendered");
		double tender = key.nextDouble();

		key.close();

		int change = (int) ((tender * 100) - (price * 100));
		double num = ((double) change) / 100;

		int dec = 1000;
		int fiv = 500;
		int dol = 100;
		int quart = 25;
		int dime = 10;
		int nick = 5;
		int pen = 1;

		if (tender < price) {
			System.out.println("This is not enough chedder");
		}

		if (tender == price) {
			System.out.println("Exact change... live life on the edge");

		} else if (tender > price) {
			System.out.println("Please wait for change $" + num);
		}
			
		int ten = change % dec;
		int five = ten % fiv;
		int doll = change % dol;
		int quarter = doll % quart;
		int dim= quarter % dime; 
		int nickel = dim % nick;
		int penny = nickel % pen;
		
		if (ten >= 0) {
			int t = ((change - ten) / dec);
			System.out.println("Change of " + t + " Ten dollar bill(s)");
		}
		
		if (ten >= fiv && ten != dec) {
			int f = ((ten - five) / fiv);
			System.out.println("Change of " + f + " five dollar bill(s)" );
		}
		
		if (five >= dol) {
			int c = ((five - doll) / dol);
			System.out.println("Change of " + c + " one dollar bill(s)" );
		}
		
		if (doll >= quart) {
			int q = doll - quarter;
			q = q / quart;
			System.out.println("Change of " + q + " quarters");
		}
		
		if (quarter >= dime) {
			int d = quarter - dim;
			d = d / dime;
			System.out.println("Change of " + d + " dimes ");
		}
		
		if (dim >= nick) {
			int n = dim - nickel;
			n = n / nick; 
			System.out.println("Change of " + n + " nickels ");
		}
		
		if (nickel >= pen) {
			int p = nickel - penny;
			p = p / pen;
			System.out.println("Change of " + p + " pennies ");
		}
		
	}// main

}// class
