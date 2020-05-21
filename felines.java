package Solanlly.Estructurasdedatos.primera.tarea;

import java.util.Random;

public class felines {
	private int age;
	private double characteristics;

	public int getAge() {
		return 5;
	}
	
	public double getcharacteristics() {
		return 8;
	}
	
	public BodyType[] cards = BodyType.values();
	public Random random = new Random();
	final BodyType random() {
		return cards[random.nextInt(cards.length)];
	}

}
