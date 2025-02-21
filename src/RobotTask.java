import becker.robots.*;
 
public class RobotTask {

	public void run() {
		// build a random city called waterloo
		City waterloo = new City();
		
		// build a robot in the city waterloo starting at street 4, avenue 1
		Letter r = new Letter(waterloo, 1, 1, Direction.EAST, 999);	
		r.printS();
		r.printA();
		r.printR();
		r.printA();
		r.printH();
	}
}
