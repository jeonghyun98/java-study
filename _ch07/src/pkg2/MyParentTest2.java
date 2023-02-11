package pkg2;

import pkg1.MyParent;

class MyChild extends pkg1.MyParent {
	public void printMembers() {
//		System.out.println(prv); // 에러 (같은클래스 안에서만 사용 가능하기 때문)
//		System.out.println(dft);// 에러 (같은 패키지에서만 사용 가능하기 때문)
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러 ( 다른 클래스이기 때문에)
//		System.out.println(p.dft); 
//		System.out.println(p.prt);
		System.out.println(p.pub); // 접근제한이 없기때문에
	}

}
