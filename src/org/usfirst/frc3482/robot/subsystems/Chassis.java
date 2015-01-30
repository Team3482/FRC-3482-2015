// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3482.robot.subsystems;

import org.usfirst.frc3482.robot.RobotMap;
import org.usfirst.frc3482.robot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Chassis extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController backLeft = RobotMap.chassisBackLeft;
    SpeedController backRight = RobotMap.chassisBackRight;
    SpeedController frontRight = RobotMap.chassisFrontRight;
    SpeedController frontLeft = RobotMap.chassisFrontLeft;
    RobotDrive robotDrive41 = RobotMap.chassisRobotDrive41;
    Gyro gyro1 = RobotMap.chassisGyro1;
    Compressor compressor1 = RobotMap.chassisCompressor1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void startCompressor() {
		compressor1.start();
	}
	public void stopCompressor() {
		compressor1.stop();
	}
    
	public void driveWithXboxController(Joystick s) {
		double leftX = s.getRawAxis(0);
		double leftY = s.getRawAxis(1);
		double rightX = s.getRawAxis(4);
		double deadZone = 0.2;

		if (leftX < deadZone && leftX > -deadZone) {
			leftX = 0;
		}
		if (leftY < deadZone && leftY > -deadZone) {
			leftY = 0;
		}
		if (rightX < deadZone && rightX > -deadZone) {
			rightX = 0;
		}
		
		//TODO: Gyro
		robotDrive41.mecanumDrive_Cartesian(leftX, leftY, rightX, 0);

	}

	public void stop() {
		robotDrive41.stopMotor();
	}
	
	//sets the safety
	public void setSafety(boolean n) {
		robotDrive41.setSafetyEnabled(n);
	}
}

