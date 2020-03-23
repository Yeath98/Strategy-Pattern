package cn.edu.qust.dp;

public class MiniDuckSimulator {
	public static void main(String[] args)
	{
		Duck mallard = new MallardDuck();
		Duck rubberDuckie = new RubberDuck();
		Duck decoy = new DecoyDuck();
		Duck model = new ModelDuck();
		
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		rubberDuckie.display();
		rubberDuckie.performQuack();
		rubberDuckie.performFly();
		
		decoy.display();
		decoy.performQuack();
		decoy.performFly();
		
		model.display();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		
		
	}

}
