package edu.kh.oop.cls.model.service;


import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;



public class ClsService {

	
	public void ex1() {
		
		Student std = new Student();
		
		System.out.println(std.v1);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		
		
		
	}
	public void ex2() {
		
		
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.setName("홍길동");
		std2.setName("김영희");
		
		
		
		System.out.println(std1.schoolName);
		
		
		System.out.println(Student.schoolName);
		
		
		Student.schoolName = "KH";
		System.out.println("변경후 : " + Student.schoolName);
		
		
	}
	
	
	public void ex4() { // 매개변수 생성자 예제
		
		
		User u1 = new User(); // 기본 생성자
		user u2 = new User("user02", "pass02"); // 매개변수 2개 생성자
		user u3 = new User("user03", "pass03", "김용기", 30, '남'); // 매개변수 5개 생성자
		
		System.out.printf("u1 : %s / %s %s %d / %c\n",
				u1.getuserId(), u1.getUserPw(), u1.getUserName()u1,
				u1.getuserAge(), u1.getuserGender()
				);
				
				
		System.out.printf("u2 : %s / %s %s %d / %c\n",
				u2.getuserId(), u2.getUserPw(), u2.getUserName()u2,
				u2.getuserAge(), u2.getuserGender()
				);
				
		
		
		System.out.printf("u3 : %s / %s %s %d / %c\n",
				u3.getuserId(), u3.getUserPw(), u3.getUserName()u3,
				u3.getuserAge(), u3.getuserGender()
						);
						
		
		
		
	}
	
	
	
	
	
	
	}
	
	
	
	

