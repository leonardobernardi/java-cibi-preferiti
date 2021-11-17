package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] favFood = { "Pizza", "Hamburger", "Profiteroles", "Empanada", "Caramel Latte",};
		int length = favFood.length;
		int first = (length - length);
		int middle = (((length + 1) / 2)-1);
		
		
		int last = (length - 1);
		System.out.println("Numeri di cibi preferiti: " + favFood.length);
		System.out.println("Primo in classifica: " + favFood[first]);
		System.out.println("Mediano: " + favFood[middle]);
		System.out.println("Ultimo in classifica: " + favFood[last]);
	}

}
