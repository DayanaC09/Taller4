import java.util.Scanner;

public class Punto2_if_else {
	public static void main(String[] args) {
		double resultado = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		double numA = input.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		double numB = input.nextDouble();
		System.out.println("Ingrese el operador numero: ");
		char operador = input.next().charAt(0);
		if(operador == '+') {
		resultado = numA + numB;
		} else if(operador == '-') {
		resultado = numA - numB;
		} else if(operador == '*') {
		resultado = numA * numB;
		} else if(operador == '/') {
		resultado = numA / numB;
		} else if(operador == '%') {
		resultado = numA % numB;
		} else {
		System.out.println("Ese operador no existe");
		}
		System.out.println("Resultado = " + resultado);
		}

}
