package arrays;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	 

	//2. create an array of 5 robots.
	Robot r[] = new Robot[12];
 	//3. use a for loop to initialize the robots.
	Random ran = new Random( );
	 
   int finish = 10;
	for(int i = 0; i < r.length; i++) {
        	  r[i] = new Robot();
        	  r[i].setX(100 + i * 150);
        	  r[i].setY(500);
              r[i].setSpeed(25);
        	  
          }
		//4. make each robot start at the bottom of the screen, side by side, facing up
         
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	while(r[0].getY()>finish&&r[1].getY()>finish&&r[2].getY()>finish&&r[3].getY()>finish&&r[4].getY()>finish) {
	for(int y = 0; y < r.length; y++) {
	    r[y].move(ran.nextInt(50));
	    if(r[y].getY()<finish) {
	    	r[y].sparkle();
	    	 
	    	break;
	    }
	} 
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
     
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}