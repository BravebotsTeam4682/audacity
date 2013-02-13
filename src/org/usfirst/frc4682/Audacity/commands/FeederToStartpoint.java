/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4682.Audacity.commands;

/**
 *
 * @author luis
 */
public class FeederToStartpoint extends CommandBase {
    boolean notifyExecute;
    
    public FeederToStartpoint() {
        requires(feeder);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.print("Initializing Feeder to Start point command");
        System.out.print("At start limit? " + feeder.atStartLimit() + "\n");
        notifyExecute = true;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (notifyExecute == true) {
            System.out.print("Beginning to drive backwards\n");
            notifyExecute = false;
        }
        feeder.setSpeed(-0.3);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return feeder.atStartLimit();
    }

    // Called once after isFinished returns true
    protected void end() {
        System.out.print("Feeder to startpoint command is finished.\n");
        feeder.setSpeed(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        System.out.print("Feeder To startpoint command has been interrupted");
    }
}
