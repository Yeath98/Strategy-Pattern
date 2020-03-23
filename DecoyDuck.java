package cn.edu.qust.dp;

public class DecoyDuck extends Duck{
	public DecoyDuck()
	{
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a duck Decoy.(Made by 1708060131)");
		
	}

	/*public void performQuack() {
		// TODO Auto-generated method stub
		
		
	}

	public void performFly() {
		// TODO Auto-generated method stub
		
	}*/

}
