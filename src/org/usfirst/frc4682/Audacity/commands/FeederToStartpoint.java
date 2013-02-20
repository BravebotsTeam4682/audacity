/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4682.Audacity.commands;
import org.usfirst.frc4682.Audacity.RobotMap;
import edu.wpi.first.wpilibj.Timer;
/**
 *
 * @author luis
 */
public class FeederToStartpoint extends CommandBase {
    boolean notifyExecute;
    boolean allowed;
    
    public FeederToStartpoint() {
        requires(feeder);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.print("Initializing Feeder to Start point command.\n");
        System.out.print("Feeder at start limit? " + feeder.atStartLimit() + "\n");
        notifyExecute = true;
        allowed = oi.thirdStick.getRawButton(2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        allowed = oi.thirdStick.getRawButton(2);
        if (notifyExecute == true) {
            System.out.print("Beginning to drive backwards\n");
            notifyExecute = false;
        }
        //feeder.setSpeed(RobotMap.feederSpeed);
        feeder.setSpeed(RobotMap.feederSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return feeder.atStartLimit() || !allowed;
    }

    // Called once after isFinished returns true
    protected void end() {
        feeder.stop();
        System.out.print("Stopped feeder wheel\n");
        feeder.setSpeed(-RobotMap.feederSpeed); // bounce back a bit
        Timer.delay(0.05);
        feeder.stop();
        System.out.print("Turned off both shooter wheels.\n");
        System.out.print("Feeder to startpoint command is finished.\n");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        System.out.print("Feeder To startpoint command has been interrupted\n");
    }
}
