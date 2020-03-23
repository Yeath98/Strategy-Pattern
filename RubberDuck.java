package cn.edu.qust.dp;

public class RubberDuck extends Duck {
	public RubberDuck()
	{
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	/*public void performQuack() {
		// TODO Auto-generated method stub
		
	}

	public void performFly() {
		// TODO Auto-generated method stub
		
	}*/

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a rubber duckie.(Made by 1708060131)");
		
	}

}
