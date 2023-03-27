// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LedColor;

public class LedSubsystem extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */

    public LedColor Color;
    private Spark blinkin;

    public LedSubsystem() {}

    @Override
    public void periodic() {
        blinkin.set(Color.color());
    }

    public void setAllianceColor() {
    if (DriverStation.getAlliance() == Alliance.Blue)
        Color = LedColor.BLUE_ALLIANCE;
    else 
        Color = LedColor.RED_ALLIANCE;
    }

    public void setBalancingColor() {
        Color = LedColor.BALANCING;
    }

    public void setBalancedColor() {
        Color = LedColor.BALANCED;
    }

    public void setClawOpen() {
        Color = LedColor.CLAW_OPEN;
    }

    public void setClawClosed() {
        Color = LedColor.CLAW_CLOSED;
    }

}
