public abstract class EnemyShip{

	private String name;
	private double aDamage;

	public String getName(){return name; }
	public void setName(String newName) {name=newName;}

	public double getDamage(){return aDamage; }
	public void setDamage(double newDamage) {aDamage=newDamage;}

	
	public void followHeroShip(){

		System.out.println(getName()+"is following the hero");	
	} 


	public void enemyShipShoots(){

	System.out.println(getName()+"attacks and does"+getDamage());	
	} 	

}
