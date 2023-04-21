package exer;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir1 = new Circle();
		
		Circle cir2 = new Circle(10, "피자");
		
		int a=10;
		int b=100;
		
		a=b;//a=10 -> a=100
		
		
		cir1 = cir2;//cir1:radius=1, name="홍길동" -> radius=10, name="피자"
		
		System.out.println(cir1.name);
		System.out.println(cir1.radius);
		
		int[] arr = {10,20,30,40,50}; 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		Circle[] cirArr;
		cirArr = new Circle[5];
		
		for(int j=0;j<cirArr.length;j++) {
			System.out.println(cirArr[j].name);
		}

	}

}
