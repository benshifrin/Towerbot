import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSubsystem extends Subsystem {
    public TalonSRX _FR,_FL,_RL,_RR;
    public DifferentialDrive _drive;


    public DriveSubsystem() {
        _FL = TalonSRX(6);
        _RL = TalonSRX(1);
        SpeedControllerGroup leftSide = new SpeedControllerGroup(_FL, _RL);

        
        _FR = TalonSRX(4);
        _RR = TalonSRX(7);
        SpeedControllerGroup rightSide = new SpeedControllerGroup(_FR, _RR);

        _drive = new DifferentialDrive(leftSide, rightSide);
    }

    public void TankDrive(double leftSpeed, double rightSpeed) {
        _drive.tankDrive(leftSpeed, rightSpeed);
    }
}

