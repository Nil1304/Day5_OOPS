
public class Car {
	//member variables
	//member functions/methods
	
	int no_of_cars;
	String Model;
	int speed;
	
	
	public void setSpeed(int s) {
		this.speed=s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	void display1() {
		System.out.println("Welcome to Audi Motors");
	}
	
	void display2() {
		System.out.println("Welcome to Hyundai Motors");
	}
	
	void display3() {
		System.out.println("Welcome to Kia-Motors");
	}
	
	
	public static void main(String args[]) {
		
		//object creation
		
		//syntax for object-- classname objectname==new classname();
		
		Car obj = new Car();
		obj.display1();
		obj.display2();
		obj.display3();
		
		obj.setSpeed(90);
		System.out.println(obj.getSpeed());
		
	}
}
