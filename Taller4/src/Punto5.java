import java.util.Scanner;

public class Punto5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double promedio = 0;
		int puntuacionSAT = 0;
		int clasificacion = 0;
		int estudiantes = 0;
		System.out.println("Verificacion de requisitos para entrar a Mountville");
		System.out.println("Digite su promedio: ");
		promedio = input.nextDouble();
		System.out.println("Digite su puntuacion SAT: ");
		puntuacionSAT = input.nextInt();
		System.out.println("¿Cual fue su clasificacion en el instituto?: ");
		clasificacion = input.nextInt();
		System.out.println("¿Cuantos estudiantes eran?: ");
		estudiantes = input.nextInt();
		if(promedio >= 4.0 && puntuacionSAT >= 1100) {
		System.out.println("Admitido");
		} else if (promedio >= 3.5 && puntuacionSAT >= 1300) {
		System.out.println("Admitido");
		} else if (promedio >= 3.0 && puntuacionSAT >= 1500) {
		System.out.println("Admitido");
		} else if ((clasificacion == 1 || clasificacion == 2) && 
		estudiantes >= 1400) {
		System.out.println("Admitido"); 
		} else {
		System.out.println("No estas admitido. Sigue intentando");
		}
		}


}
