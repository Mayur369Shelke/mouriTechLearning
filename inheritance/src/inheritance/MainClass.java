package inheritance;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		
		String inputside = JOptionPane.showInputDialog("please add side of square");
				double side = Integer.parseInt(inputside);
		
		String inputwidth = JOptionPane.showInputDialog("please add width of rectangle");
				double width = Integer.parseInt(inputwidth);
				
				String inputlength = JOptionPane.showInputDialog("please add length of rectangle");
				double length = Integer.parseInt(inputlength);
				
				String inputradius = JOptionPane.showInputDialog("please add radius of circle");
				double radius = Integer.parseInt(inputradius);
				
				String color = JOptionPane.showInputDialog("please add color");
				
				String filled = JOptionPane.showInputDialog("please add filled it must br true or false");

				Square square = new Square(color, true, width, length, side);
				Circle circle = new Circle(radius);
				System.out.println("Area of the rectangle is ===="+square.getArea());
				System.out.println("perimeter of the rectangle is ===="+square.getPerimeter());
				System.out.println("Area of the circle is ==="+circle.getArea());
				
				Square square2 = new Square();
				
				
			System.out.println(square2.mayur());	
				
	}

}
