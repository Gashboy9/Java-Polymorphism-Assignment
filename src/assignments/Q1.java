package assignments;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle (5,6);
		System.out.println(rect.getArea());
		
		Triangle tri = new Triangle (5,6);
		System.out.println(tri.getArea());

	}

}




abstract class Shapes{
	
	private String color;
	
	public abstract double getArea();
	
	public String toString() {
		return "Area of rectangle is: "+ getArea();
	}
	
}


class Rectangle extends Shapes {
	
	private double length;
	private double width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		double area = width * length;
		return area;
	}
	
}


class Triangle extends Shapes {
	
	private double base;
	private double height;
	
	Triangle (double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		double area = (height * base) / 2;
		return area;
	}
	
}