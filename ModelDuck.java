package cn.edu.qust.dp;

public class ModelDuck extends Duck {
public ModelDuck(){
	flyBehavior = new FlyRocketPowered();
	quackBehavior = new Quack();
}
	/*public void performQuack() {
		// TODO Auto-generated method stub
		
	}
*/
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck.(Made by 1708060131)");
	}

	/*public void peformFly() {
		// TODO Auto-generated method stub
		
	}*/

	
}
