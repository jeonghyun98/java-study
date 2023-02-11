abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다."); }
}

interface Fightable { // 인터페이스의 모든 메서드는 public abstract. 예외없이
	void move(int x, int y); // public abstract가 생략됨
	void attack(Fightable f); //public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	// 싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}
public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		Fightable f2 =  f.getFightable();
		System.out.println(f2);
//		Fightable f = new Fighter();
//		f.move(100, 200);
//		Fighter f2 = new Fighter();
//		f.attack(f2);
	}

}
