import java.util.Scanner;
public class Punto2_switch_case {
	public static void main(String[] args) {
		double resultado = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		double numA = input.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		double numB = input.nextDouble();
		System.out.println("Ingrese el operador numero: ");
		char operador = input.next().charAt(0);
		switch (operador) {
		case '+':
		resultado = numA + numB;
		break;
		case '-':
		resultado = numA - numB;
		break;
		case '*':
		resultado = numA * numB;
		break;
		case '/':
		resultado = numA / numB;
		break;
		case '%':
		resultado = numA % numB;
		break;
		default:
		System.out.println("Ese operador no existe");
		break;
		}
		System.out.println("Resultado = " + resultado);
		}


}
