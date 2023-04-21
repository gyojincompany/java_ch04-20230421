package exer;

public class Shape {
	
	public Circle outputArea(Circle cir) {//객체를 인자값으로 받는 메서드
		//반환타입이 Circle클래스로 만들어진 객체이므로 반환 객체의 클래스인 Circle이 반환 타입임
		cir.name="이순신";//"홍길동"->"이순신"
		
		return cir;//객체를 반환하는 return문
	}
	
	//메소드 오버로딩
	public void print() {
		System.out.println("안녕하세요");
	}
	
	public void print(String name) {
		System.out.println("안녕하세요");
	}
	
	public void print(String name, int age) {
		System.out.println("안녕하세요");
	}
	

}
