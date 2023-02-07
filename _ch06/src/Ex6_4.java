
public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		long result1 = mm.max(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(12); // 구구단 3단을 출력
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}

}

class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan <=9))
			return; // 입력받은 단(dan)이 2~9
		
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
		return; // 생략가능
	}
	
	long max(long a, long b) {
		if(a>b)
			return a;
		else
			return b;
	}
	// return a+b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(long a, long b) { return a / b; }
}
