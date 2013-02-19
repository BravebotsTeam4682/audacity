package org.usfirst.frc4682.Audacity.commands;

/*
 * This command only manages the control of the shooter wheel speeds.
 * It uses the throttle on the first two connected joysticks.
 * A 90 degree throttle above the horizontal is full speed.
 */

public class StopAll extends CommandBase {
    
    public StopAll() {
        //requires(shooter);
        //requires(feeder);
        //requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        enabled = false;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
