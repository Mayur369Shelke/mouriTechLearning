package inheritance;

public class Circle extends Shape {
	
double radius;

public Circle(String color, boolean filled, double radius) {
	super(color, filled);
	this.radius = radius;
}

public Circle(double radius) {
	this.radius = radius;
}

public Circle() {
	super();
	// TODO Auto-generated constructor stub
}

public Circle(String color, boolean filled) {
	super(color, filled);
	// TODO Auto-generated constructor stub
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}


@Override
public String toString() {
	return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
}

double getArea() {
	
double area = 3.1415 * radius *radius;

return area;
}

}
