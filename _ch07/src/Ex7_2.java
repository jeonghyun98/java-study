
public class Ex7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child p = new Child();
		p.method();
	}

}

class Parent { int x = 10; }

class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
