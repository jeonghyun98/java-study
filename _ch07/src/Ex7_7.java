
public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine f = new FireEngine();
		
		FireEngine fe = null;
		Car car = (FireEngine)f;
		
		car.drive();
		
		fe = (FireEngine)car;
		fe.water();
		
	}

}


class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}