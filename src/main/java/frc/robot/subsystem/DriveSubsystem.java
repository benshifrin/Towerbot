package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSubsystem extends Subsystem {
    public WPI_TalonSRX _FR,_FL,_RL,_RR;
    public DifferentialDrive _drive;


    public DriveSubsystem() {
        _FL = new WPI_TalonSRX(6);
        _RL = new WPI_TalonSRX(1);
        SpeedControllerGroup leftSide = new SpeedControllerGroup(_FL, _RL);

        
        _FR = new WPI_TalonSRX(4);
        _RR = new WPI_TalonSRX(7);
        SpeedControllerGroup rightSide = new SpeedControllerGroup(_FR, _RR);

        _drive = new DifferentialDrive(leftSide, rightSide);
    }

    public void TankDrive(double leftSpeed, double rightSpeed) {
        _drive.tankDrive(leftSpeed, rightSpeed);
    }

    public void initDefaultCommand() {
        
    }
}

