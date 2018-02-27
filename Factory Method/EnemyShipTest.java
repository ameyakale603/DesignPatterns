import java.util.Scanner;

public class EnemyShipTest {

	public static void main(String[] args){
		
	
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("What type of ship? (U / R / B)");
		
		if (userInput.hasNextLine()){
			
			String typeOfShip = userInput.nextLine();
		
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}	
			if(theEnemy != null){
				
				doStuffEnemy(theEnemy);
				
			} else System.out.print("Please enter U, R, or B next time");
		
		}
		
		
	
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		
		
		
		anEnemyShip.followHeroShip();
		
		anEnemyShip.enemyShipShoots();
		
	}
	
}
