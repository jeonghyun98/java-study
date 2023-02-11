
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3 = new Point3D(1,2,3);
		p3.getLocation();
	}

}

class Point2 {
	int x;
	int y;
	
	Point2(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point2 {
	int z;
	
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	String getLocation() { //오버라이딩
		return "x :" + x + ", y :"+ y + ", z :" + z;
	}
}