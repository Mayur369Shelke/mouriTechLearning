package losscouplingInJava;

public class Traveler {
	public vehical v;

	public vehical getV() {
		return v;
	}

	public void setV(vehical v) {
		this.v = v;
	}
	
	public void startJ() {
		v.move();
	}


}
