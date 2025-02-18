import becker.robots.*;

public class RobotTask {

	public void run() {
		// TODO Auto-generated method stub
		
		// build a random city called waterloo
		City waterloo = new City();
		
		// build a robot in the city waterloo starting at street 4, avenue 1
		Robot r = new Robot(waterloo, 0, 0, Direction.NORTH, 0);

		r.move();
		
		//need to create a robot of type LetterBot

		
	}

}
