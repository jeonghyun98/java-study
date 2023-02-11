public class Ex06 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5, 3);
		long result2 = mm.subtract(5, 3);
		long result3 = mm.multiply(5, 3);
		long result4 = mm.divide(5, 3);
		
		System.out.println("add(5L, 3L)" + result1);
		System.out.println("add(5L, 3L)" + result2);
		System.out.println("add(5L, 3L)" + result3);
		System.out.println("add(5L, 3L)" + result4);
	}
	
	class MyMath {
		long add (long a, long b) { return a + b;}
		long subtract (long a, long b) { return a - b;}
		long multiply (long a, long b) { return a * b;}
		long divide (long a, long b) { return a / b;}
	}
}
