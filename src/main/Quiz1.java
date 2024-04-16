package main;

public class Quiz1 {

	public static void main(String[] args) {
		
		Calc cal = new Calculator();
		
		
//		다운캐스팅 
		if(cal instanceof Calculator) {
			Calculator calulator = (Calculator) cal;	//우측의 (Calculator)를 좌측 Calculator에 copy 하겠다. 주소값 copy 
			calulator.showInfo();
		}
			

	}

}
