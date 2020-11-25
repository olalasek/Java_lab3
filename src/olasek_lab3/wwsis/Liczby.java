package olasek_lab3.wwsis;

public class Liczby {

	public static void main (String [] args) {
		
		metoda1();
		System.out.println(trzy());
		System.out.println(suma(5,9));
		
		System.out.println("Liczba= " + trzy());
		System.out.println("Suma 5+9= " + suma(5,9));
		System.out.println("Suma 3+3= " + suma(trzy(), trzy()));
	}
	
	public static void metoda1 () {
		System.out.println("Ta metoda nic nie zwraca ");
	}
	
	public static int trzy () {
		return (3); //Ta metoda zwraca liczbę 3
	}
	
	public static int suma (int a, int b) {
		return a+b; //Ta metoda zwraca sumę dwóch parametrów
	}
}