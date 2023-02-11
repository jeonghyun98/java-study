class TestClass{
	long a, b;
	
	void instanceMethod() {
		System.out.println(a+b);
	}
	
	static void staticMethod(long a, long b){
		System.out.println(a-b);
	}
	
	
	
}


public class Ex6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass mm = new TestClass();
		mm.a = 5;
		mm.b = 3;
		
		System.out.printf(mm.instanceMethod());
		System.out.println(TestClass.staticMethod(5L, 3L));
		
	}

}
