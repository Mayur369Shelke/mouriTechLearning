package inheritance;

public class Square extends Rectangle {
	
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(String color, boolean filled, double width, double length, double side) {
		super(color, filled, width, length);
		this.side = side;
	}

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", width=" + width + ", length=" + length + ", color=" + color + ", filled="
				+ filled + "]";
	}

	

	private String name() {
		return "mayuyr";
	}
	
public String mayur() {
		
		return name();
		
	}
}
