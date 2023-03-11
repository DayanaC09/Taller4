import java.util.Scanner;


public class Punto1 {
	public static void main(String args[]) {
		Scanner NUM = new Scanner(System.in);
		System.out.println("Ingrese el numero : ");
		int num = NUM.nextInt();
		boolean x = num <= 7 ? true : false;
		System.out.println("Resultado: " + x);
		}

}
