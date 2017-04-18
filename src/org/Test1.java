package org;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class Test1 {
 
	
	float wheelAngleA = (float) Math.toRadians(0);
	float wheelAngleB = (float) Math.toRadians(120);
	float wheelAngleC = (float) Math.toRadians(240);
	
	public static void main(String[] args) {
		Test1 robot = new Test1();
		System.out.println("Hello there");
		Delay.msDelay(1000);
		robot.moveRobot(45,50,0);
		Delay.msDelay(3000);
		robot.stopRobot();
	}
	
	public void moveRobot(double direction, double vLinear, double vAngular) {
		direction = Math.toRadians(direction);
		vAngular = Math.toRadians(vAngular);
		float vWheelA = (float) ((vLinear*(Math.cos(direction)*Math.cos(wheelAngleA)-Math.sin(direction)*Math.sin(wheelAngleA)))+vAngular);
		float vWheelB = (float) ((vLinear*(Math.cos(direction)*Math.cos(wheelAngleB)-Math.sin(direction)*Math.sin(wheelAngleB)))+vAngular);
		float vWheelC = (float) ((vLinear*(Math.cos(direction)*Math.cos(wheelAngleC)-Math.sin(direction)*Math.sin(wheelAngleC)))+vAngular);
		Motor.A.setSpeed(vWheelA);
		Motor.A.setSpeed(vWheelB);
		Motor.A.setSpeed(vWheelC);
		
		System.out.println(vWheelA);
		System.out.println(vWheelB);
		System.out.println(vWheelC);
	}
	
	public void stopRobot() {
		Motor.A.stop();
		Motor.B.stop();
		Motor.C.stop();
	}

}
