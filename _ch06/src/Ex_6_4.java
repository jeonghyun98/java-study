
public class Ex_6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
	}

}		
	class MyMath {
		long add(long a, long b) {
			long result = a+b;
			return result;
		}
	}
