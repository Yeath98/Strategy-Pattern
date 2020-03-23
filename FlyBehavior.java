package cn.edu.qust.dp;

public interface FlyBehavior {
	public void fly();

}
	class FlyWithWings implements FlyBehavior
	{

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("I'm flying!!");
			
		}
		} 

	class FlyNoWay implements FlyBehavior
	{

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("I can't fly");
			
		}
		} 
	

