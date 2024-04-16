package main;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		System.out.println("전화 상담 할당 방식 선택하세요.");
		System.out.println("1. 한명식 차례로");
		System.out.println("2. 쉬고 있거나 대기 가장 적은 상담원할당");
		System.out.println("3. 우선순위가 높은 고객 먼저 할당");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		Scheduler scheduler = null;
		
		if(num ==1) {
			scheduler = new RoubndRobin();
		}else if(num == 2) {
			scheduler = new LeastJob();
		}else if(num == 3) {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원 X 기능입니다");
		}
		
		if(scheduler != null) {		//=> 실제 인스턴스가 있는지 체크
			scheduler.getNextCal();
			scheduler.sendCallToAgent();
		}
		
	}

}


//순서대로 전화를 배분하는 정책
class RoubndRobin implements Scheduler{

	@Override
	public void getNextCal() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다. ^-^");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다. ^o^");
	}
	
}

// 대기자 적은 순으로 상담원 배분
class LeastJob implements Scheduler{

	@Override
	public void getNextCal() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다. ^-^");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무 없거나 대기가 가장 적은 상담원에게 전달합니다.");
		
	}
	
}
// 등급 높은 고객의 전화부터 가져와서 업무능력 높은 상담원 우선 배분
class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCal() {
		System.out.println("등급이 높은 고객의 전화 먼저 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬 높은 상담원에게 우선적 전달합니다.");
		
	}
	
}
	




