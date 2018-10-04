import java.util.concurrent.TimeUnit;

/*
 *  control types;
 *  type:	description:
 *  0		cab-1
 *  1		TMCC    ************ our train engine is legacy
 *  2		Legacy   our tracks currently are legacy 
 *  3		R100
 */

/* 
 * For actions that require a list of actions we can handle it by first;
 * creating a string to hold the list of actions. 
 * then adding each action to that list and returning it
 * the start  command marker (D1) and end marker (DF) keep things in order
 */


public class Controls{

//	public static void init(trainPtr t) {
//
//	}

	public static String checkSensors(){ //a constant pool of calls to the sensors
		
		return "";
	}

	public static String  switchTrack(int number) { //this method will control the switches on the track
		return ""+number+"";
	}

	public static String  Accelerate(int number, trainPtr t){ //method to handle train acceleration, number is 
		if(t.getDirection()== "L") { //the train is facing left, left facing data packet
			return "";
		}
		
		else { // the train is facing right, right facing data packet
			return "";
		} 
	}

	public static String  Decelerate(trainPtr t) { //method to handle train deceleration
		if(t.getDirection()== "L") { //the train is facing left, left facing data packet
			return "";
		}
		
		else { // the train is facing right, right facing data packet
			return "";
		}
	}

	public static String Go(trainPtr t) { //Tells the train to start moving
		
		if(t.getDirection()== "L") { //the train is facing left, left facing data packet
			return "";
		}
		
		else { // the train is facing right, right facing data packet
			return "";
		}
	}

	public static String Stop(trainPtr t) { //Tells the train to stop
		return"";
	}

	public static String Reverse(trainPtr t) {
		if(t.getDirection()== "L") { //the train is facing left, left facing data packet
			return "";
		}
		
		else { // the train is facing right, right facing data packet
			return "";
		}
	}
	
	public static String curveDecel(trainPtr t) { //Has the train slow depending on the severity of the curve. 
		if(t.getDirection()== "L") { //the train is facing left, left facing data packet
			return "";
		}
		
		else { // the train is facing right, right facing data packet
			return "";
		}
	}

	public static void timeDelay(int min, int sec) throws InterruptedException {
		TimeUnit.SECONDS.sleep(sec);
		TimeUnit.MINUTES.sleep(min);
	}


	public static String howFastAmI(trainPtr t) {

		return"";
	
	}

}
