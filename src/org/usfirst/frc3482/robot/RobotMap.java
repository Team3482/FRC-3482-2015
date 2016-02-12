// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3482.robot;
    
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc3482.robot.subsystems.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Solenoid catapultSolenoid1;
    public static Solenoid catapultSolenoid2;
    
    public static SpeedController armsArms;
    public static DigitalInput armsLimitSwitch1;
    public static DigitalInput armsLimitSwitch2;
    public static DigitalInput armsLimitSwitch3;
    public static DigitalInput armsLimitSwitch4;
    public static DigitalInput armsLimitSwitch5;
    public static DoubleSolenoid armsDoubleSolenoid1;
    public static SpeedController chassisBackLeft;
    public static SpeedController chassisBackRight;
    public static SpeedController chassisFrontRight;
    public static SpeedController chassisFrontLeft;
    public static RobotDrive chassisRobotDrive41;
    public static Gyro chassisGyro1;
    //public static IMU gyroIMU;
    public static Compressor chassisCompressor1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        catapultSolenoid1 = new Solenoid(0, 6);      
        LiveWindow.addActuator("catapult", "Solenoid 1", catapultSolenoid1);
        
        catapultSolenoid2 = new Solenoid(0, 7);      
        LiveWindow.addActuator("catapult", "Solenoid 2", catapultSolenoid2);
        
        armsArms = new CANTalon(4);
        //LiveWindow.addActuator("Arms", "Arms", (TalonSFX) armsArms);
        
        armsLimitSwitch1 = new DigitalInput(0);
        LiveWindow.addSensor("Arms", "Limit Switch 1", armsLimitSwitch1);
        
        armsLimitSwitch2 = new DigitalInput(1);
        LiveWindow.addSensor("Arms", "Limit Switch 2", armsLimitSwitch2);
        
        armsLimitSwitch3 = new DigitalInput(2);
        LiveWindow.addSensor("Arms", "Limit Switch 3", armsLimitSwitch3);
        
        armsDoubleSolenoid1 = new DoubleSolenoid(0, 5, 4);      
        LiveWindow.addActuator("Arms", "Double Solenoid 1", armsDoubleSolenoid1);
        
        chassisBackLeft = new CANTalon(1);
        //LiveWindow.addActuator("Chassis", "BackLeft", (TalonSFX) chassisBackLeft);
        
        chassisBackRight = new CANTalon(3);
        //LiveWindow.addActuator("Chassis", "BackRight", (TalonSFX) chassisBackRight);
        
        chassisFrontRight = new CANTalon(2);
        //LiveWindow.addActuator("Chassis", "FrontRight", (TalonSFX) chassisFrontRight);
        
        chassisFrontLeft = new CANTalon(0);
        //LiveWindow.addActuator("Chassis", "FrontLeft", (TalonSFX) chassisFrontLeft);
        
        chassisRobotDrive41 = new RobotDrive(chassisFrontLeft, chassisBackLeft,
              chassisFrontRight, chassisBackRight);
        
        chassisRobotDrive41.setSafetyEnabled(true);
        chassisRobotDrive41.setExpiration(0.1);
        chassisRobotDrive41.setSensitivity(0.5);
        chassisRobotDrive41.setMaxOutput(1.0);

        chassisGyro1 = new Gyro(0);
        LiveWindow.addSensor("Chassis", "Gyro 1", chassisGyro1);
        chassisGyro1.setSensitivity(0.007);
        chassisCompressor1 = new Compressor(0);
        
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
