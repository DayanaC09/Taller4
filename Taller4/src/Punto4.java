import java.util.Scanner;

public class Punto4 {
	public static void main(String[] args) {
		double weight = 0;
		int planet;
		String namePlanet = null;
		Scanner input = new Scanner(System.in);
		System.out.println("What's your weight on the planet: ");
		weight = input.nextFloat();
		System.out.println("If you wish to know what could be your weight in other planet, choose a planet, please");
		System.out.println("1: Mercurio | 2: Venus | 3: Marte | 4: Jupiter | 5: Saturno | 6: Urano | 7: Neptuno ");
		planet = input.nextInt();
		if (planet == 1) {
		weight = weight * 0.38;
		namePlanet = "Mercurio";
		} else if(planet == 2) {
		weight = weight * 0.91;
		namePlanet = "Venus";
		} else if(planet == 3) {
		weight = weight * 0.38;
		namePlanet = "Marte";
		} else if(planet == 4) {
		weight = weight * 2.36;
		namePlanet = "Jupiter";
		} else if(planet == 5) {
		weight = weight * .92;
		namePlanet = "Saturno";
		} else if(planet == 6) {
		weight = weight * .89;
		namePlanet = "Urano";
		} else if(planet == 7) {
		weight = weight * 1.13;
		namePlanet = "Neptuno";
		} else {
		System.out.println("This planet is not in the list. Sorry");
		}
		String message = String.format("Your weight on %s is %.2f lbs.", 
		namePlanet, weight);
		System.out.println(message);
		}

}
