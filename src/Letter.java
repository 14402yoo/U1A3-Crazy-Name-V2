import becker.robots.*;

public class Letter extends Robot {
    public Letter(City var1, int var2, int var3, Direction var4, int var5) {
        super(var1, var2, var3, var4, var5);
    } 

    public void printS() {
        move_and_put(4);	
		turn_right();	
		move(1);
		turn_right();
		move(5);
		turnLeft();
		move_and_put(2);
		turnLeft();
		move(1);
		move_and_put(4);
		turn_right();
		move(1);
		move_and_put(2);
		turn_right();
		move(1);
		move_and_put(4);
		turnLeft();
		turnLeft();
		move(6);
    }
    
    public void printA() {
		turnLeft();
		move_and_put(5);
		turn_right();
		move_and_put(1);
		turnLeft();
		move_and_put(1);
		turn_right();
		move_and_put(3);
		turn_right();
		move_and_put(1);
		turnLeft();
		move_and_put(1);
		turn_right();
		move_and_put(6);
		turn_right();
		move(4);
		turn_right();
		move(4);
		turn_right();
		move_and_put(4);
		move(1);
		turn_right();
		move(3);
		turnLeft();
    }
    
    public void printR() {
		turnLeft();
		move_and_put(6);
		turn_right();
		move_and_put(5);
		turn_right();
		move(1);
		turnLeft();
		turn_right();
		move_and_put(2);
		turn_right();
		move_and_put(5);
		turn_left(2);
		move(3);
		turn_right();
		move_and_put(1);
		turnLeft();
		move(1);
		turn_right();
		move_and_put(1);
		turnLeft();
		move(1);
		turn_right();
		move_and_put(2);
		//for consistent start 
		repeat(() -> {
			turnLeft();
			move(1);
		}, 2);
		turn_right(); 
    }

    public void printH() {
		turnLeft();
		move_and_put(7);
		turn_right(2);
		move(4);
		turnLeft();
		move_and_put(5);
		turnLeft();
		move(3);
		turn_left(2);
		move_and_put(7);
		//for consistent start 
		repeat(() -> {
			turnLeft();
			move(1);
		}, 2);
		turn_right();  
    }

    /**
	 * Repeates a runnable function for t times.
	 * @param func function to run
	 * @param t the number of times to repeat the function.
	 */
	public void repeat(Runnable func, int t) {
		for (int i = 0; i < t; ++i) {
			func.run();
		}
	}

	/**
	 * Moves the robot n blocks forward.
	 * @param robot Robot to move
	 * @param n the number of blocks to move
	 */
	public void move(int n) {
		repeat(() -> {
			move();
		}, n);	
	}
	
	/**
	 * Put a thing first and then move  Repeats this for n times.
	 * @param robot Robot to move
	 * @param n the number of times to perform this function.
	 */
	public void move_and_put(int n) {
		repeat(() -> {
			putThing();
			move();
		}, n);	
	}

	/**
	 * Make robot turn left for n times
	 * @param robot Robot to move
	 * @param n the number of times to perform this function.
	 */
	public void turn_left(int n) {
		repeat(() -> {
			turnLeft();
		}, n);
	}

	/**
	 * Make robot turn right for n times
	 * @param robot Robot to move
	 * @param n the number of times to perform this function.
	 */
	public void turn_right(int n) {
		repeat(() -> {
			turn_right();
		}, n);
	}


	/**
	 * Make robot turn right for n times
	 * @param robot Robot to move
	 * @param n the number of times to perform this function.
	 */
	public void turn_right() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
