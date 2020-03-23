package cn.edu.qust.dp;

public class MallardDuck extends Duck {
	public MallardDuck()
	{
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard duck.(Made by 1708060131)");
		
	}

	/*public void performFly() {
		// TODO Auto-generated method stub
		
	}

	public void performQuack() {
		// TODO Auto-generated method stub
		
	}
*/
}
