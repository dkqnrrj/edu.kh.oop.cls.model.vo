package edu.kh.oop.cls.model.vo;

public class User {


	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;

	
		public User() {
			
			System.out.println("user 객체 생성");
			
			// 필드 초기화
			userId = "user01";
			userPw = "pass01";
			userName = "홍길동";
			userAge = 20;
			userGender = '남';
			
			// 기본생성자를 이용하여 User 객체를 만들면
			// 그 객체는 프린터 구문을 수행하고,
			// 필드 초기화 구문을 거쳐서 홍길동 하나가 만들어짐
			
		}
	
		// 매개변수 생성자
		// 사용되는 기술, 변수 : 매개변수, 오버로딩, this
		
		// 매개변수 : 생성자나 매서드 호출 시 () 안에 작성되어
		// 			전달 되어지는 값을 저장하는 변수
		// = 전달 받은 값을 저장하고 있는 매개체 역할의 변수
		
		public User(String userid , String userPw ) {
			
			System.out.println("매개변수 생성자를 이용해서 User 객체 생성");
			System.out.println(userId + "/" + userPw);
			
			this.userId = userId;
			this.userPw = userPw;
			
			
			
		}
		
		
		
		// 필드를 전부 초기화 하는 목적의 매개변수 생성자
		
		public User( String userId, String userPw, String userName,
				int userAge, char userGender) {
			
			
			
			//System.out.println();
			
			// this() 생성자
			// 같은 클래스의 다른 생성자를 호출 할 때 사용
			// 생성자 내에서 반드시 첫번째 줄에 작성 되어야 한다 (위에 //syso 처럼 다른 코드 쓰면 에러남)
			
			// 왜 사용하는가
			// 중복 코드 제거, 코드 길이 감소, 재사용성 증가
			// 가독성이 별로인 경우가 많아서 잘 사용은 안함.
			
			
			this(userId, userPw); // this 생성자
			//this.userId = userId;
			//this.userPw = userPw;
			this.userName = userName; // this 참조 변수
			this.userAge = userAge;
			this.userGender = userGender;
			
		}
		
		
		
		// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용 안함
		
		// 오버 로딩 (Over Loading) == 과적
		
		// 클래스 내에 동일한 이름의 매서드(생성자도 포함)를 여러개 작성하는 기법
		// 하나의 이름으로 여러 기능을 수행 할 수 있게 하는 것
		
		// [오버로딩 조건]
		
		// 1) 메서드의 이름이 동일해야 한다
		// 2) 매개변수의 갯수, 타입, 순서 중 1개라도 달라야한다.
		
		// public User() {} // 기본 생성자가 이미 작성 되어있어서 중복 오류
		
		public User(String userId) {} // 매개변수의 갯수가 같은 생성자가 없으므로 오버로딩 성립함
		
		
		public User(int userAge) {} // 매개변수의 타입이 다르므로 오버로딩 성립
		
		public User(String userId, int userAge) {} // 매개변수의 갯수와 동일한 것은 있으나 하나의 타입이 다름
		
		public User(int userAge, String userId) {} // 매개변수의 갯수, 타입은 동일하나 순서가 다름
		
		// public User(int userAge, String userName) {} // 매개 변수의 갯수, 타입, 순서가 모두 동일해서 오버로딩 불가, 변수명은 신경 안씀
		
		
		
		
		
		
		
		
		
		
		
		
		
	//캡슐화로 인한 간접 접근 기능 (getter/setter)
	public String getUserId() {
		return userId;
		
	}
	
	
	
	public void setUserId(String userId) {
		this.userId = userId;
		
		
	}
	
	
	public String getUserPw() {
		
		return userPw;
	}
	
	
	
}