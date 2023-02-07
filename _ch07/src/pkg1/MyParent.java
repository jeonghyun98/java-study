package pkg1;

public class MyParent { // 접근제어자가 default
	private int prv;  // 같은 클래스
	int dft;          // 같은 패키지
	protected int prt;// 같은 패키지 + 자손(다른 패키지)
	public int pub;   // 접근제한 없음.
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest { // 한패키지에 public 패키지는 하나만

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러 ( 다른 클래스이기 때문에)
		System.out.println(p.dft); 
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
