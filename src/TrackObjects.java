
/*
 *This class will be used to create all of the track objects. 
 *Straight section, sensor sections, junctions, etc. 
 */
public class TrackObjects { 

	
	public TrackObjects(int num, int lftCnct, int rtCnct,int lenth) {
		
		final int ID = num; //this is the tracks id number
		
		int leftConnect = lftCnct; // what track does the left side connect to (ref using ID nums)?
		int rightConnect = rtCnct; // what track does the right side connect to (ref using ID nums)?
		int length = lenth;
		
	}
	
	public static Object sensorTrack(int num) {
		return null;
	}
	
	public static Object yJuncTrack(int num) {
		return null;
	}
	
	public static Object curTrack() {
		return null;
	}
}
