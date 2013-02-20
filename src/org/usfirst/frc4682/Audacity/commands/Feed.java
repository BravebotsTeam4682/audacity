/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4682.Audacity.commands;
import org.usfirst.frc4682.Audacity.commands.FeederToEndpoint;
/**
 *
 * @author Audacity
 */
public class Feed extends CommandBase {
    private boolean executed = false;
    
    public Feed() {
        requires(feeder);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (oi.getButton(2, oi.thirdStick)) {
            new FeederToEndpoint().start();
        }
        executed = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return executed;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
