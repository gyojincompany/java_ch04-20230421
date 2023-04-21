package exer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cir1 = new Circle();
		
		Circle cir2 = new Circle(10, "피자원");
		
		double area = cir1.gerArea();
		System.out.println(area);
		
		cir2.printArea("홍길동");
		
	}

}
