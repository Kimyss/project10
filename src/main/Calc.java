package main;

public interface Calc {

	int ERROR = -9999; //계산시 오류 났을 때 사용할 에러코드
	
	int add(int num1, int num2);
	
	int substract(int num1, int num2);
	
	int time(int num1, int num2);
	
	int divide(int num1, int num2);
	
//	인터페이스 안에선 final, abstract 자동저장, 생략
}
