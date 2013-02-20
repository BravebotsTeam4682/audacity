/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4682.Audacity.commands;
import org.usfirst.frc4682.Audacity.commands.TankDrive;

/**
 *
 * @author luis
 */
public class RestartDrive extends CommandBase {
    private boolean enabled = false;
    
    public RestartDrive() {
        //requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.print("Restarting the Drive Train");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.enable();
        enabled = true;
        TankDrive tankDrive = new TankDrive();
        tankDrive.start();
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return enabled;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
