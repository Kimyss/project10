package main;

public class Ex1 {

	public static void main(String[] args) {
		
//		Calc calc = new Calc();  추상클래스 마찬가지로 상속이 목적, 직접사용불가 
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(10,5));
		System.out.println(calculator.substract(10, 5));
		System.out.println(calculator.time(10, 5));
		System.out.println(calculator.divide(10, 5));

	}

}

//	인터페이스를 상속받는 자식 맹글기		부모의 추상메소드 받아서 정의를 해줘야 에러해소
class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
		

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int time(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
		
	
//	정보출력메소드추가
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현");
	}
	
}
