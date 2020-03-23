package cn.edu.qust.dp;

public interface QuackBehavior {
	

	public void quack();
}
	class Quack implements QuackBehavior
	{

	
		public void quack() {
			// TODO Auto-generated method stub
		System.out.println("Quack");
		}
		} 
	
	class Squeak implements QuackBehavior
	{

		@Override
		public void quack() {
			// TODO Auto-generated method stub
		System.out.println("Squeak");
			
		}
		} 
	
	class MuteQuack implements QuackBehavior
	{

		@Override
		public void quack() {
			// TODO Auto-generated method stub
		System.out.println("<< Silence >>");
			
		}
		} 


