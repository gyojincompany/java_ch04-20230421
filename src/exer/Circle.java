package exer;

public class Circle {
	
	int radius;
	String name;
	
	public Circle() {//생성자(객체를 초기화할때)
		this.radius = 1;
		this.name="홍길동";
	}
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double gerArea() {
		double area = this.radius * this.radius * 3.14;
		return area;
	}
	
	public void printArea(String name) {
		
		System.out.println(name);
	}
	
}
