package tightcouplingInJava;

public class Traveler {
	
	car car = new car();
	
	public void startJournery() {
		car.move();
		//tarveler depending on car

	}

}
