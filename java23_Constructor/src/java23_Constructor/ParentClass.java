package java23_Constructor;

public class ParentClass {
	public ParentClass() {
		System.out.println("난 부모의 Default 생성자");
	}

	static {
		System.out.println("난 부모의 static");
	}
	{
		System.out.println("난 부모의 연산자블럭");
	}
	
}
