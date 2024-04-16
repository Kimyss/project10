package main;

public class Ex3 {

	public static void main(String[] args) {
		
//		첫번째 버전의 계산기 생성 Calculator(); 와 NewCalculator(); 인터페이스 : 유지보수에 용이
		
		Calc calc = new NewCalculator();
		
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.time(10, 0));
		System.out.println(calc.divide(10, 20));
		
	}
}
		



// 새로운 버전의 계산기 클래스
class NewCalculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

//	곱하는 수가 0 또는 음수라면 에러코드 반환
	@Override
	public int time(int num1, int num2) {
//		return num1 * num2;
		if(num1 * num2 <= 0) {
			return Calc.ERROR;
		} else {
			return num1 * num2;
		}
	}
//	첫째 숫자가 두번재숫자보다 더 작다면 에러코드반환
	@Override
	public int divide(int num1, int num2) {
//		return num1 / num2;
		if(num1 < num2) {
			return ERROR;
		}else {
			return num1 / num2;
		}
	}
	
}