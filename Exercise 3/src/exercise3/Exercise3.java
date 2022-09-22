package exercise3;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("Introduce the current year: "); //Se pide el año actual.
		Scanner sc = new Scanner(System.in); //Declaración de scanner.
		int a = sc.nextInt(); //Input de año actual = a
		System.out.println("Introduce your year of birth: "); //Se pide el año de nacimiento.
		int b = sc.nextInt(); //Input de año de nacimiento = b
		System.out.println("You are " + (a - b) + " years old."); //Se resta el año actual con el año de nacimiento.
		sc.close(); //Se cierra el scanner.
	}
}

