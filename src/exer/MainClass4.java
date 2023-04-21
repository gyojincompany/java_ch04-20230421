package exer;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = new Member("tiger","12345","홍길동",27);
		
//		member.id = "cat";//member 객체의 id값이 "tiger"->"cat"
//		member.pw = "888888";
		
		member.setName("이순신");//member 내의 멤버변수 id값을 cat으로 변경
		
		System.out.println(member.getName());//tiger 출력
		
		final int a=10;//a가 상수로 선언
		//a=100;//a는 변경 불가능
		

	}

}
