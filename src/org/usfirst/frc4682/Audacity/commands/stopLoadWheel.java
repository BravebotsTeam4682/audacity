package org.usfirst.frc4682.Audacity.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4682.Audacity.Robot;

public class  stopLoadWheel extends CommandBase {
    public stopLoadWheel() {
        requires(Robot.loader);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
