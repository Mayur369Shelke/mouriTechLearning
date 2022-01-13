package inheritance;

public class Rectangle extends Shape{
	
	double width;
	double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}
	public Rectangle( double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	double getArea() {
		double area = width * length;
		return area;
		
	}
	
	double getPerimeter() {
		double perimeter = width*width*length*length;
		return perimeter;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}
	
	

}
