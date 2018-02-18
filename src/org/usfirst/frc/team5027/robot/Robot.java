/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.networktables.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
	Spark topl = new Spark(1);
	
	Spark botl = new Spark(2);
	
	Spark topr = new Spark(3);
	
	Spark botr = new Spark(0);
	
	Spark elevator = new Spark(5);
	
	Talon intake1 = new Talon(7);
	
	Talon intake2 = new Talon(8);
	
	Joystick joy = new Joystick(0);
	
	Timer time = new Timer();
	
	DigitalInput limit1 = new DigitalInput(1);
	
	DigitalInput limit2 = new DigitalInput(2);
	
	SpeedControllerGroup left = new SpeedControllerGroup(topl, botl);
	SpeedControllerGroup right = new SpeedControllerGroup(topr, botr);
	DifferentialDrive drive = new DifferentialDrive(left, right);
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional comparisons to
	 * the switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
		
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		time.start();
		while(isAutonomous()) {
			
		/*//--------------------------------------------Switch no turning
		while(time.get()<14) {	
			if (time.get()<2.5) {
				drive.arcadeDrive(0.7,0);
			}
			else {drive.arcadeDrive(0,0);}}
		*/
			
		
			/*//------------------------------------------Switch right side turning
		while(time.get()<14) {
			if(time.get()<2.5) {
			drive.arcadeDrive(0.7,0);
		}
			else if(time.get()>2.5&&time.get()<3.2) {
			drive.arcadeDrive(0, -.6);
		}
			else if(time.get()>3.2&&time.get()<4.7) {
				drive.arcadeDrive(0.5,0);
			}
			else {drive.arcadeDrive(0,0);}}
		*/
			
			
		/*//---------------------------------------------------scale right side turning	
		while(time.get()<14) {
			if(time.get()<5) {
				drive.arcadeDrive(0.7,0);
			}
			else if(time.get()>5&&time.get()<5.7) {
				drive.arcadeDrive(0, -.6);
			}
			else if(time.get()>5.7&&time.get()<6.3) {
				drive.arcadeDrive(0.5,0);
			}
			else {drive.arcadeDrive(0,0);}}
		*/
			
		
		/*//------------------------------------------------------Scale no turning
		while(time.get()<14) {
			if(time.get()<5) {
				drive.arcadeDrive(0.7,0);
			}
			else {drive.arcadeDrive(0,0);}}
		*/
			
			
		/*//------------------------------------------------------Scale left side turning
			while(time.get()<14) {
				if(time.get()<4.3) {
					drive.arcadeDrive(0.7,0);
				}
				else if(time.get()>4.3&&time.get()<4.8) {
					drive.arcadeDrive(0, .6);
				}
				else if(time.get()>4.8&&time.get()<6.3) {
					drive.arcadeDrive(0.5,0);
				}
				else {drive.arcadeDrive(0,0);}}
		*/
			
			
		/*//--------------------------------------------------Switch left side turning
			while(time.get()<14) {
				if(time.get()<2.5) {
				drive.arcadeDrive(0.7,0);
			}
				else if(time.get()>2.5&&time.get()<3.2) {
				drive.arcadeDrive(0, .6);
			}
				else if(time.get()>3.2&&time.get()<4.7) {
					drive.arcadeDrive(0.5,0);
				}
				else {drive.arcadeDrive(0,0);}}
		*/
			
			
		/*//--------------------------------------------------Middle start turn left
			while(time.get()<14) {
				if(time.get()<2.5) {
					drive.arcadeDrive(0.7,0);
				}
				else if(time.get()>2.5&&time.get()<3.2) {
					drive.arcadeDrive(0, .6);
				}
				else if(time.get()>3.2&&time.get()<4.7) {
					drive.arcadeDrive(0.5,0);
				}
				else {drive.arcadeDrive(0,0);}}
		*/
			
		
		/*//--------------------------------------------------Middle start turn right
			while(time.get()<14) {
				if(time.get()<2.5) {
					drive.arcadeDrive(0.7,0);
				}
				else if(time.get()>2.5&&time.get()<3.2) {
					drive.arcadeDrive(0, .6);
				}
				else if(time.get()>3.2&&time.get()<4.7) {
					drive.arcadeDrive(0.5,0);
				}
				else {drive.arcadeDrive(0,0);}}
		*/
		
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		//----------------------------------------drive
		drive.arcadeDrive(-.8*joy.getRawAxis(1), .8*joy.getRawAxis(2));
		
		//----------------------------------------shutdown
		if (joy.getRawButton(9)){
			drive.arcadeDrive(0,0);
			topl.set(0);
			topr.set(0);
			botr.set(0);
			botl.set(0);
			elevator.set(0);
			intake1.set(0);
			intake2.set(0);
		}else{}
		
		//--------------------------------------elevator
		if (joy.getRawButton(6)) {//down
			if (limit1.get()==true&&limit2.get()==false) {
				elevator.set(-.8);
		}	
			else if (limit1.get()==false&&limit2.get()==false) {
				elevator.set(-.8);
			}
			else if(limit2.get()==true&&limit1.get()==false) {
				elevator.set(0);
		}
		}
		else if (joy.getRawButton(5)) {//up
			if (limit1.get()==false&&limit2.get()==true) {
				elevator.set(.8);
			}
			else if (limit1.get()==false&&limit2.get()==false) {
				elevator.set(.8);
			}
			else if (limit1.get()==true&&limit2.get()==false) {
				elevator.set(0);
			}
		}
		else if (joy.getRawButton(10)) {
			elevator.set(0);
		}
		else {elevator.set(0);}
		
		//-------------------------------------in-out
		if (joy.getRawButton(2)) {
			time.start();
			if(time.get()<1) {
				intake1.set(-0.5);
				intake2.set(0.5);
				time.delay(0.1);
				intake1.set(0);
				intake2.set(0);
				time.delay(0.2);}
		}
		else if (joy.getRawButton(4)) {
			time.start();
			if(time.get()<1) {
				intake1.set(0.8);
				intake2.set(-0.8);
				time.delay(0.1);
				intake1.set(0);
				intake2.set(0);
				time.delay(0.2);
			}
		}
		else if (joy.getRawButton(1)) {
			time.start();
			if(time.get()<1) {
				intake1.set(0.6);
				intake2.set(0.6);
				time.delay(0.1);
				intake1.set(0);
				intake2.set(0);
				time.delay(0);
			}
		}
		else if (joy.getRawButton(3)) {
			time.start();
			if(time.get()<1) {
				intake1.set(0.6);
				intake2.set(0.6);
				time.delay(0.1);
				intake1.set(0);
				intake2.set(0);
				time.delay(0.2);}
		}
		else {
			intake1.set(0);
			intake2.set(0);
			time.reset();}
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {}
	
}
