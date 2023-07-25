package edu.kh.oop.cls.model.vo.Member;

import edu.kh.oop.cls.model.vo.Member.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
//[접근 제한자] [예약어] 반환형 메서드명 ([매개변수])
		// 대괄호 안에 있는건 생략 가능
		
		
		MemberService service = new MemberService();
		
		// MemberService의기본 생성자가 작성되어있지 않지만
		// 컴파일러가 코드를 번역할때
		// 클래스 내부에 생성자가 하나도 없다면
		//자동으로 기본 생성자를 추가해주기 때문에
		//문제없이 사용 가능
		
		//주의사항
		// 만약에 생성자가 하나라도 있으면 자동 생성은 안해준다.
		
		service.displayMenu(); // 메서드 호출 구문
		
		
	}
	
	
	
	
	
}
