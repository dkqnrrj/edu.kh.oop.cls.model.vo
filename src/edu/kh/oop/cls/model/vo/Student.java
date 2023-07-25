package edu.kh.oop.cls.model.vo;

public class Student {

	
	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	private int v4 = 40;
	
	
	public void ex() {
		
		System.out.println( v1 );
		System.out.println( v2 );
		System.out.println( v3 );
		System.out.println( v4 );
		
	}
		public static String schoolName = "KH고등학교";
		
		private String name;
		
		{
			name = "김길동";
		}
		
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
			
			
		}
		
		
	
		
}
		
		
		
	
	
	
	
	

	
	
	
	
	

