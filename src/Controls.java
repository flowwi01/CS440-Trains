import java.util.concurrent.TimeUnit;


/*
 * For actions that require a list of actions we can handle it by first;
 * creating a string to hold the list of actions. 
 * then adding each action to that list and returning it
 * the start  command marker (D1) and end marker (DF) keep things in order
 */


public class Controls {

	public static void init(trainPtr t) {

	}

	public static String  checkSensors(){ //a constant pool of calls to the sensors
		return "";
	}

	public static String  switchTrack(int number) { //this method will control the switches on the track
		return "";
	}

	public static String  Accelerate(int number){ //method to handle train acceleration, number is 
		//the adjusted speed value, check to make sure that 
		//the adjustment is in fact an increase and not a decrease. 
		return "";
	}

	public static String  Decelerate() { //method to handle train deceleration
		return"";
	}

	public static String Go() { //Tells the train to start moving
		return"";
	}

	public static String Stop() { //Tells the train to stop
		return"";
	}

	public static String Reverse() {
		return "";
	}
	
	public static void curveDecel() { //Has the train slow depending on the severity of the curve. 

	}

	public static void timeDelay(int min, int sec) throws InterruptedException {
		TimeUnit.SECONDS.sleep(sec);
		TimeUnit.MINUTES.sleep(min);
	}


	public static String howFastAmI(String Name) {

		return"";
	
	}

}
