package exer;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape1 = new Shape();
		
		Circle cir = new Circle();
		
		Circle cir2 = shape1.outputArea(cir);
		
		System.out.println(cir2.name);
		
	}

}
