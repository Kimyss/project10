package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		System.out.println("드라이버 선택");
		System.out.println("1. mySql");
		System.out.println("2. oracle");
		System.out.println("3. postgres");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		Database database = null;
		if(num == 1) {
			database = new MySql();
		}else if(num == 2){
			database = new Oracle();
		}else if (num == 3){
			database = new postrges();
		}else {
			System.out.println("잘못된선택");
		}
		
		if (database != null){
			database.database();
			
		}
		
	}
}


class MySql implements Database{

	@Override
	public void database() {
		System.out.println("MySql DB에 연결");
		
	}
}

class Oracle implements Database{

	@Override
	public void database() {
		System.out.println("오라클DB 연결");
		
	}
	
}

class postrges implements Database{

	@Override
	public void database() {
		System.out.println("postgres 연결");
		
	}
	
}
	

